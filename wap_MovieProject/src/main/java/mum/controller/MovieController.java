package mum.controller;

import mum.dao.MovieDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;
import mum.model.DateModel;

@WebServlet({"", "/movie"})
public class MovieController extends HttpServlet {

    MovieDAO movieDAO = new MovieDAO();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        req.setAttribute("schedules", movieDAO.selectTodaySchedule("20190319"));

        RequestDispatcher view = req.getRequestDispatcher("movie.jsp");
        view.forward(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            String jsonSting = req.getParameter("date");
            ObjectMapper mapper = new ObjectMapper();

            DateModel dateModel = mapper.readValue(jsonSting, DateModel.class);
            System.out.println(dateModel.getDate());


            PrintWriter out = resp.getWriter();
            try {
                out.print(mapper.writeValueAsString(movieDAO.selectTodaySchedule(dateModel.getDate())));
            } catch (JsonGenerationException e) {
                e.printStackTrace();
            }


        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
