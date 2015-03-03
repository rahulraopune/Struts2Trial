package rahulapps.example;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomePage extends ActionSupport
{
	public String execute()
	{
		HttpSession session = ServletActionContext.getRequest().getSession();
		if(session==null || session.getAttribute("user")==null)
		{
			return "error";
		}
		else if(session.getAttribute("user")!=null )
		{
		
			return "success";
		}
		else
		{
			return "";
		}
	}
}
