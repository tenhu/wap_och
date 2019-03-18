package mum.controller;

import mum.dao.MovieDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet({  "", "/movie" })
public class MovieController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        MovieDAO movieDAO = new MovieDAO();

        req.setAttribute("schedules", movieDAO.selectTodaySchedule());

        RequestDispatcher view = req.getRequestDispatcher("movie.jsp");
        view.forward(req, resp);
    }


}
