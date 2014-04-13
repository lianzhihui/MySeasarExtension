package com.len.myseasarextension.test;

import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;


public class TestMain {

	public TestLogic testLogic;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final String PATH = "test.dicon";
		SingletonS2ContainerFactory.setConfigPath(PATH);
		SingletonS2ContainerFactory.init();
		S2Container container = SingletonS2ContainerFactory.getContainer();

		TestMain testMain = (TestMain) container.getComponent("main");
		testMain.process();
	}

	public void process() {
		testLogic.doTest();
	}
}
