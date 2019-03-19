package mum.controller;

import mum.dao.MovieDAO;
import mum.model.UserModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;



@WebServlet( {"/payment"} )
public class PaymentController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("movie");
    }




    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession(false);

        if (session != null && session.getAttribute("uname") != null) {
            System.out.println("session have");

            req.setAttribute("nameSession", "ok");
            UserModel userModel = new UserModel();
            req.setAttribute("user", userModel);
        }

        String tCount = req.getParameter("tCount");
        String tPrice = req.getParameter("tPrice");

        req.setAttribute("tCount", tCount);
        req.setAttribute("tPrice", tPrice);

        RequestDispatcher view = req.getRequestDispatcher("payment.jsp");
        view.forward(req, resp);

    }
}
