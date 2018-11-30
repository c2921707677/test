/**
 * 
 */
package tij.fourteen;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author chengj
 *
 */
interface SomeMethods {
	void boring1();
	void boring2();
	void insteresting(String arg);
	void boring3();
}

class Implementation implements SomeMethods {

	@Override
	public void boring1() {
		// TODO Auto-generated method stub
		System.out.println("boring1");
	}

	@Override
	public void boring2() {
		// TODO Auto-generated method stub
		System.out.println("boring2");
	}

	@Override
	public void insteresting(String arg) {
		// TODO Auto-generated method stub
		System.out.println("interesting : " + arg);
	}

	@Override
	public void boring3() {
		// TODO Auto-generated method stub
		System.out.println("boring3");
	}
	
}

class MethodSelector implements InvocationHandler {

	private Object proxied;

	public MethodSelector(Object proxied) {
		// TODO Auto-generated constructor stub
		this.proxied = proxied;
	} 
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		if (method.getName().equals("insteresting"))
			System.out.println("Proxy detected the interesting method");
		return method.invoke(proxy, args);
	}
	
}

public class SelectingMethods {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomeMethods proxy = (SomeMethods)Proxy.newProxyInstance(
				SomeMethods.class.getClassLoader(), 
				new Class[] {SomeMethods.class},
				new MethodSelector(new Implementation()));
		proxy.boring1();
		proxy.boring2();
		proxy.insteresting("bonobo");
		proxy.boring3();
	}

}
