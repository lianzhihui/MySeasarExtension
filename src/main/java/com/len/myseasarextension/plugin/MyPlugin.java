package com.len.myseasarextension.plugin;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.servlet.ServletContext;

import org.seasar.cubby.action.ActionResult;
import org.seasar.cubby.plugin.AbstractPlugin;
import org.seasar.cubby.plugin.ActionInvocation;

public class MyPlugin extends AbstractPlugin {

	private Set<Interceptor> interceptorSet;

	public void initialize(final ServletContext servletContext)
			throws Exception {
		super.initialize(servletContext);
		interceptorSet = new LinkedHashSet<Interceptor>();
		interceptorSet.add(new FirstInterceptor());
		interceptorSet.add(new SecondInterceptor());
		interceptorSet.add(new ThirdInterceptor());
	}

	@Override
	public ActionResult invokeAction(final ActionInvocation invocation)
			throws Exception {

		InterceptorChain interceptorChain = new InterceptorChain(invocation,
				interceptorSet.iterator());
		return interceptorChain.chain();
	}
}
