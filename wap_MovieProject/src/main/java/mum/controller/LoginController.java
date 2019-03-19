package mum.controller;

import mum.dao.MovieDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;


@WebServlet( {"/login"} )
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher view = req.getRequestDispatcher("login.jsp");
        view.forward(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String uname = req.getParameter("uname");
        String upass = req.getParameter("password");
        String uRemem = req.getParameter("remember");

        //System.out.println("check box value: "  +uremem);

        UserController userController = new UserController();

        if(userController.checkUser(uname, upass)) {

            HttpSession session=req.getSession();
            session.setAttribute("uname",uname);

            if( uRemem != null ) {
                Cookie cookie = new Cookie("wapName", uname);
                cookie.setMaxAge(3600*24*30); //in seconds
                resp.addCookie(cookie);
            } else {
                for (Cookie cookie : req.getCookies()) {
                    if (cookie.getName().equals("wapName")) {
                        cookie.setMaxAge(0);
                        resp.addCookie(cookie);
                    }
                }
            }

            resp.sendRedirect("movie");
        } else {
            resp.getWriter().println("Chi hudlaa");
        }

    }
}