package com.len.myseasarextension.plugin;

import org.seasar.cubby.action.ActionResult;

public class ThirdInterceptor extends BaseInterceptor {
	
	@Override
	public ActionResult process(final InterceptorChain interceptorChain) throws Exception {
		
		//TODO 
		System.out.println("-------------------------- Third interceptor: before");
		
		ActionResult result = super.process(interceptorChain);
	
		//TODO 
		System.out.println("-------------------------- Third interceptor: after");
		
		return result;
	}
}
