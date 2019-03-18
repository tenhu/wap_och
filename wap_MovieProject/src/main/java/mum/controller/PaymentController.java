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

        String id = "4";
        int ticketCount = 2;

        MovieDAO movieDAO = new MovieDAO();
        req.setAttribute("movies", movieDAO.selectMovies(id));

        RequestDispatcher view = req.getRequestDispatcher("payment.jsp");
        view.forward(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = 4;
        int ticketCount = 2;

        String result = "";
        MovieDAO movieDAO = new MovieDAO();
        boolean check = movieDAO.updateSeat(id, ticketCount);


        if(check) { result = "Success";  }
        else {
            result = "failed";
        }

        req.setAttribute("paymentResult", result);

        System.out.println("update result: " + result);
        RequestDispatcher view = req.getRequestDispatcher("payment.jsp");
        view.forward(req, resp);

    }
}
