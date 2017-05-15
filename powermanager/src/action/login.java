package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class login extends ActionSupport implements SessionAware{
	private String name;
	private String password;
	private Map<String, Object> session ;
	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//处理登录请求
	public String login(){
		if("a".equals(name)&&"123".equals(password)){
			session.put("loginInfo", name);
			return SUCCESS;
		}
		else{
			session.put("loginerror", "密码或用户名错误");
			return ERROR;
		}
	}
}
