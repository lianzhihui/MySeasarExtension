package com.len.myseasarextension.plugin;

import org.seasar.cubby.action.ActionResult;


public class FirstInterceptor extends BaseInterceptor {

	@Override
	public ActionResult process(final InterceptorChain interceptorChain) throws Exception {

		//TODO 
		System.out.println("-------------------------- First interceptor: before");
		
		ActionResult result = super.process(interceptorChain);
		
		//TODO 
		System.out.println("-------------------------- First interceptor: after");
		
		return result;
	}
}
