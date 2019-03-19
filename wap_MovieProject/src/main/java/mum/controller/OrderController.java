package mum.controller;


import mum.dao.MovieDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( {"/order"} )
public class OrderController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        MovieDAO movieDAO = new MovieDAO();
        req.setAttribute("movies", movieDAO.selectMovies("1"));

        RequestDispatcher view = req.getRequestDispatcher("order.jsp");
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String sid1 = req.getParameter("sid1");

        HttpSession session=req.getSession();
        session.setAttribute("sid",sid1);

        System.out.println(sid1);
        MovieDAO movieDAO = new MovieDAO();
        req.setAttribute("movies", movieDAO.selectMovies(sid1));

        RequestDispatcher view = req.getRequestDispatcher("order.jsp");
        view.forward(req, resp);
    }
}
