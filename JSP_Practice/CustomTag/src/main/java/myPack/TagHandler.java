package myPack;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class TagHandler extends SimpleTagSupport {
	public void doTag()throws JspException, IOException{
		JspWriter out=getJspContext().getOut();
		
		SimpleDateFormat sdf=new SimpleDateFormat("E, dd-mm-yyyy, hh:mm:ss, a");
		Calendar cal= Calendar.getInstance();
		Date dt=cal.getTime();
		out.print("Current Date and Time: "+sdf.format(dt));
	}
}
