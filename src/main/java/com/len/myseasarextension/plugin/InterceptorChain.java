package com.len.myseasarextension.plugin;

import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.seasar.cubby.action.ActionContext;
import org.seasar.cubby.action.ActionResult;
import org.seasar.cubby.plugin.ActionInvocation;


public class InterceptorChain {

	private ActionInvocation invocation;
	private Iterator<Interceptor> interceptorsIterator;
	
	public InterceptorChain(final ActionInvocation invocation,
			Iterator<Interceptor> interceptorsIterator) {
		this.invocation = invocation;
		
		this.interceptorsIterator = interceptorsIterator;
	}
	
	public ActionResult chain() throws Exception {
		if (interceptorsIterator.hasNext()) {
			final Interceptor interceptor = interceptorsIterator.next();
			return interceptor.process(this);
		} else {
			return invocation.proceed();
		}		
	}
	
	public HttpServletRequest getRequest() {
		return invocation.getRequest();
	}
	
	public HttpServletResponse getResponse() {
		return invocation.getResponse();
	}
	
	public ActionContext getActionContext() {
		return invocation.getActionContext();
	}
}
