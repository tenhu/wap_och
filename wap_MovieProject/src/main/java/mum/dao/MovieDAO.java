package mum.dao;

import mum.model.MovieModel;
import mum.model.ScheduleModel;
import mum.model.TimeModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieDAO {

    public MovieDAO() {

    }

    private Connection connect() {
        // SQLite connection string

        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:sqlite:/Users/tenhu/IdeaProjects/wap_MovieProject/src/main/resources/database/movie.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            //System.out.println("Success: ");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public MovieModel selectMovies(int id) {

        String sql = "select s.id, m.MovieName, m.Description, m.Director,  s.time , s.date ,s.available," +
                " s.showroom , m.PictureURL, s.TicketPrice from MovieSchedule s\n" +
                "            , Movie  m where date = '20190316'\n" +
                "            and s.movieid = m.id and s.id = "+ id;

        MovieModel result = null;
        
        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set

               result = new MovieModel(rs.getInt("id"), rs.getString("moviename"),
                        rs.getString("description"), rs.getString("director"), rs.getString("pictureurl"),
               rs.getString("time"), rs.getString("date"), rs.getInt("available"),
                       rs.getString("showroom"), rs.getInt("TicketPrice"));

        } catch (SQLException e) {
            System.out.println("Error on movies" +e.getMessage());
        }

        return result;
    }

    public List<ScheduleModel> selectTodaySchedule() {

        String sql = "select id, PictureURL from Movie";
        List<ScheduleModel> scheduleList = new ArrayList<>();

        try {
            Connection conn = this.connect();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // loop through the result set
            while (rs.next()) {

                List<TimeModel> times = new ArrayList<>();

                Statement stmt1 = conn.createStatement();
                ResultSet rs1 = stmt1.executeQuery("select id, time from MovieSchedule where date = '20190316' and movieid = " + rs.getInt("id"));
                while (rs1.next()) {
                    times.add(new TimeModel(rs1.getInt("id"), rs1.getString("time")));
                }
                scheduleList.add(new ScheduleModel(rs.getInt("id"),
                        times, rs.getString("PictureURL")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return scheduleList;
    }

    public boolean updateSeat(int id, int count) {


        String sql = "update MovieSchedule set available = (available - " + count + ")   where id =" + id ;

        MovieModel result = null;

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error on movies" +e.getMessage());
            return false;
        }


        return true;
    }



}
