package interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class auth extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		ActionContext context =  ActionContext.getContext();
		Map<String, Object> session = context.getSession();
		if(session.get("loginInfo") != null){
			String result = ai.invoke();
			return result;
		}
		else{
			return "login";
		}
		
	}
	
}
