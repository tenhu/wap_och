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


@WebServlet( {"/result"} )
public class resultController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.sendRedirect("movie");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        HttpSession session = req.getSession(false);
        String tCount = req.getParameter("tCount");
        String tPrice = req.getParameter("tPrice");

        if (session == null) {
            resp.sendRedirect("movie");
        } else {

            String id = (String) session.getAttribute("sid");

            int ticketCount = 0;
            String result = "";
            MovieDAO movieDAO = new MovieDAO();
            boolean check = movieDAO.updateSeat(id, tCount);

            if (check) {
                result = "success";
                req.setAttribute("movies", movieDAO.selectMovies(id));
                req.setAttribute("tCount", tCount);
                req.setAttribute("tPrice", tPrice);

            } else {
                result = "failed";
            }

            System.out.println("result: " + result);

            req.setAttribute("paymentResult", result);

            RequestDispatcher view = req.getRequestDispatcher("result.jsp");
            view.forward(req, resp);
        }
    }
}