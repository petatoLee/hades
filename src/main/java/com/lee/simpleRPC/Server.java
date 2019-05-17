package com.lee.simpleRPC;

public interface Server {
	public void start() throws Exception;

	public void stop();

	@SuppressWarnings("rawtypes")
	public void register(Class classInterface, Class impl);

	boolean isRunning();
}
