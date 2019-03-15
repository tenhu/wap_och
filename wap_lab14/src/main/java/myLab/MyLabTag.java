package myLab;

import java.io.IOException;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyLabTag  extends SimpleTagSupport {
    String foreColor;
    String size;

    public void doTag() throws JspException, IOException {

        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        //System.out.println("Current Date: " + ft.format(dNow));

        JspWriter out = getJspContext().getOut();
        out.write(String.format("<span style='color:%s; font-size: %s;' >%s</span>", foreColor, size, ft.format(dNow)));

    }

    // Setters
    public void setForeColor(String foreColor) {
        this.foreColor = foreColor;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
