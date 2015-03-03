package rahulapps.example;

import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware
{
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String age;
	private String nationality;
	
	
	private SessionMap<String, Object> sessionMap;
	
	
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	@Override
	public void validate()
	{
		if (StringUtils.isEmpty(getUsername()))
		{
			addFieldError("username",getText("username.required"));
		}
		if(StringUtils.isEmpty(getPassword()))
		{
			addFieldError("password",getText("password.required"));
		}
		/*if(StringUtils.length(getPassword()) < 6)
		{
			addFieldError("password","password is less than six characters");
		}*/
		if(StringUtils.isEmpty(getFirstname()))
		{
			addFieldError("firstname",getText("firstname.required"));
		}
		if(StringUtils.isEmpty(getLastname()))
		{
			addFieldError("lastname",getText("lastname.required"));
		}
		if(StringUtils.isEmpty(getAge()))
		{
			addFieldError("age",getText("age.required"));
		}
		if(StringUtils.isEmpty(getNationality()))
		{
			addFieldError("nationality",getText("nationality.required"));
		}
	}
	
	public String execute() 
	{
			if(getPassword().equals("rao"))
			{
				sessionMap.put("login", "true");
				sessionMap.put("user",getUsername());
				return "success";
			}
			else
			{
				
				return "error";		
			}
	}
	@Override
	public void setSession(Map<String, Object> sessionMap) 
	{
		// TODO Auto-generated method stub
		this.sessionMap = (SessionMap<String, Object>) sessionMap;
	}
}
