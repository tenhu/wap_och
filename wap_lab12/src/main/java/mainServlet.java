import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class mainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session=req.getSession(false);

        if(session == null) {
            resp.sendRedirect("login");
        }else {

            String userName = (String) session.getAttribute("uname");
            resp.getWriter().println("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"utf-8\" />\n" +
                    "    <title>Hello </title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "\n" +
                    "    You are logged in : " + userName + "<br/> "  +
                    "    <a href=\"logout\" >Logout</a>\n" +
                    "</body>\n" +
                    "</html>");


        }

    }

}
