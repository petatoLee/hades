package com.lee.simpleRPC;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerCenter implements Server {
	private boolean isRunning = false;// 运行状态
	private ExecutorService executorService = Executors.newFixedThreadPool(10);// 线程池
	private static Map<String, Class> registerMaps = new HashMap<>();// 服务注册
	private static final String host = "127.0.0.1";
	private static final int port = 8090;

	@Override
	public void start() throws Exception {
		ServerSocket socket = new ServerSocket(port);
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("关闭线程池...");
				executorService.shutdown();
			}
		}));
		System.out.println("服务端开启...");
		while (true) {
			//服务端处理逻辑
			executorService.execute(new ServerTask(socket.accept()));
		}
	}

	@Override
	public void stop() {
		isRunning = false;
		executorService.shutdown();
	}

	@Override
	public void register(Class classInterface, Class impl) {
		registerMaps.put(classInterface.getName(), impl);
	}

	@Override
	public boolean isRunning() {
		return isRunning;
	}

	public static class ServerTask implements Runnable {
		private Socket socket;
		private ObjectInputStream in;
		private ObjectOutputStream out;

		public ServerTask(Socket socket) {
			super();
			this.socket = socket;
		}

		@Override
		public void run() {
			try {
				in = new ObjectInputStream(socket.getInputStream());
				String serviceName = in.readUTF();
				String methodName = in.readUTF();
				Class[] parameterTypes = (Class[]) in.readObject();
				Object[] parameter = (Object[]) in.readObject();
				Class serviceNameClass = registerMaps.get(serviceName);
				if (null == serviceNameClass) {
					throw new ClassNotFoundException();
				}
				// 反射调用服务方法
				Method method = serviceNameClass.getMethod(methodName, parameterTypes);
				Object result = method.invoke(serviceNameClass.newInstance(), parameter);
				out = new ObjectOutputStream(socket.getOutputStream());
				out.writeObject(result);
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (null != in) {
					try {
						in.close();
					} catch (IOException e) {
						e.printStackTrace();
						in = null;
					}
				}
				if (null != out) {
					try {
						out.close();
					} catch (IOException e) {
						e.printStackTrace();
						out = null;
					}
				}
				if (null != socket) {
					try {
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
						socket = null;
					}
				}
			}
		}

	}

}
