package mum.controller;

import mum.dao.MovieDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet( {"/payment"} )
public class PaymentController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.sendRedirect("movie");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String tCount = req.getParameter("tCount");
        String tPrice = req.getParameter("tPrice");

        req.setAttribute("tCount", tCount);
        req.setAttribute("tPrice", tPrice);

        RequestDispatcher view = req.getRequestDispatcher("payment.jsp");
        view.forward(req, resp);

    }
}
