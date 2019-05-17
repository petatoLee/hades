package com.lee.simpleRPC;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * @author zt 根据指定接口获取代理对象
 * @param <T>
 */
public class RPCClients<T> {
	private static final String serverIp = "127.0.0.1";
	private static final int port = 8090;
	private static final int timeout = 3000;
	private Socket scoket = null;
	private ObjectOutputStream out = null;
	private ObjectInputStream in = null;

	public T getProxy(Class interfaces) {
		return (T) Proxy.newProxyInstance(RPCClients.class.getClassLoader(), new Class[] { interfaces },
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						scoket = new Socket();
						SocketAddress address = new InetSocketAddress(serverIp, port);
						scoket.connect(address, timeout);
						try {
							out = new ObjectOutputStream(scoket.getOutputStream());
							out.writeUTF(interfaces.getName());
							out.writeUTF(method.getName());
							out.writeObject(method.getParameterTypes());
							out.writeObject(args);
							in = new ObjectInputStream(scoket.getInputStream());
							Object result = in.readObject();
							return result;
						} catch (Exception e) {
							e.printStackTrace();
							return null;
						} finally {
							if (null != out) {
								out.close();
							}
							if (null != in) {
								in.close();
							}
							if (null != scoket) {
								scoket.close();
							}

						}
					}
				});
	}

}
