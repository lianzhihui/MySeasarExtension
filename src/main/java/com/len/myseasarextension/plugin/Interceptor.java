package com.len.myseasarextension.plugin;

import org.seasar.cubby.action.ActionResult;

public interface Interceptor {

	ActionResult process(final InterceptorChain interceptorChain) throws Exception ;
}
