package mum.dao;

import mum.model.MovieModel;
import mum.model.ScheduleModel;
import mum.model.TimeModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieDAO {

    public MovieDAO(){

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
            System.out.println("Success: ");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public List<MovieModel> selectAllMovies(){

        String sql = "select * from Movie";
        List<MovieModel> movieList = new ArrayList<>();

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {
                movieList.add(new MovieModel(rs.getInt("id"), rs.getString("moviename"),
                        rs.getString("description"), rs.getString("director"),  rs.getString("pictureurl") ));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return movieList;
    }


    public List<ScheduleModel> selectTodaySchedule(){

        String sql = "select s.id, m.MovieName, s.time, s.available, s.showroom, m.PictureURL  from MovieSchedule s, Movie  m where date = '20190316'\n" +
                "                                          and s.movieid = m.id";
        List<ScheduleModel> scheduleList = new ArrayList<>();

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            while (rs.next()) {

                List<TimeModel> times = new ArrayList<>();
                String  movietimes[] =  rs.getString("time").split(",");

                for (String movietime : movietimes) {
                    times.add(new  TimeModel(movietime));
                }

                scheduleList.add(new ScheduleModel(rs.getInt("id"), rs.getString("moviename"),
                        times, rs.getInt("available"),  rs.getInt("showroom"), rs.getString("PictureURL") ));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return scheduleList;
    }


}
