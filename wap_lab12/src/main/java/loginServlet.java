import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class loginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String userName = "";
        String check = "";
        boolean promoCheck = true;

        for (Cookie cookie : req.getCookies()) {
            if (cookie.getName().equals("wapName")) {
                userName = cookie.getValue();
                check = "checked";
            }
            if (cookie.getName().equals("promo")) {
                cookie.setMaxAge(3600*24*30); //in seconds
                resp.addCookie(cookie);
                promoCheck = false;
            }

        }

        if(promoCheck) {
        Cookie cookie = new Cookie("promo", "$100");
        cookie.setMaxAge(3600*24*30); //in seconds
        resp.addCookie(cookie); }


        resp.getWriter().println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "\n" +
                "<head>\n" +
                "    <meta charset=\"utf-8\" />\n" +
                "    <title>Hello </title>\n" +
                "</head>\n" +
                "\n" +
                "<body>\n" +
                "    <form method=\"POST\"  >\n" +
                "        <label for=\"uname\">Name:</label> <br />\n" +
                "        <input type=\"text\" id=\"uname\" name=\"uname\"  value=\""   +  userName  +  "\" /><br />\n" +
                "        <label for=\"password\">Password: </label><br />\n" +
                "        <input type=\"password\" id=\"password\" name=\"password\" /><br />\n" +
                " <input type=\"checkbox\" name=\"remember\" value=\"remember\" " + check +"   > Remember me  <br/> " +
                "        <button type=\"submit\">Login</button>\n" +
                "    </form>\n" +
                "</body>\n" +
                "\n" +
                "</html>");
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
                        //System.out.println("cookie oldloo");
                    }
                }
            }

            resp.sendRedirect("main");
        } else {
            resp.getWriter().println("Chi hudlaa");
        }

    }
}
