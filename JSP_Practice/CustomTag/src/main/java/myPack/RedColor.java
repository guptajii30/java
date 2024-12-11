package myPack;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.BodyTagSupport;

public class RedColor extends BodyTagSupport {

	private static final long serialVersionUID = 1L;
	public int doAfterBody()throws JspException{
		String bodyText=getBodyContent().getString();
		try {
			String highlightedText="<span style='color:red;'>"+bodyText+"<span>";
			getBodyContent().getEnclosingWriter().write(highlightedText);
		}catch (Exception e){
			throw new JspException(e);
		}
		return SKIP_BODY;
	}
}
