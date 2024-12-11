package myPack;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.BodyTagSupport;

public class PowerOfANum extends BodyTagSupport {

	private static final long serialVersionUID = 1L;
	private int num,pow;
	
	public void setNum(int num) {
		this.num = num;
	}
	public void setPow(int pow) {
		this.pow = pow;
	}
	
	public int doStartTag()throws JspException{
		long result=1;
		for (int i=1; i<=pow; i++) {
			result =result+1;
		}
		JspWriter out=pageContext.getOut();
		try {
			out.print(num+"^"+pow+"="+result);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
	
}
