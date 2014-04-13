package com.len.myseasarextension.plugin;

import org.seasar.cubby.action.ActionResult;

public class SecondInterceptor extends BaseInterceptor {

	@Override
	public ActionResult process(final InterceptorChain interceptorChain)
			throws Exception {

		// TODO
		System.out.println("-------------------------- Second interceptor: before");
		
		ActionResult result = super.process(interceptorChain);

		// TODO
		System.out.println("-------------------------- Second interceptor: after");
		
		return result;
	}
}
