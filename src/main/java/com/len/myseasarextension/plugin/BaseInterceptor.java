package com.len.myseasarextension.plugin;

import org.seasar.cubby.action.ActionResult;

public abstract class BaseInterceptor implements Interceptor {

	public void init() {

	}

	@Override
	public ActionResult process(final InterceptorChain interceptorChain)
			throws Exception {

		return interceptorChain.chain();
	}
}
