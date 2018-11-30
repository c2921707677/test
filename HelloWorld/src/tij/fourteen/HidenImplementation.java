/**
 * 2018年11月23日
 */
package tij.fourteen;

import java.lang.reflect.Method;

/**
 * @author chengj
 */
public class HidenImplementation {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		A a = HiddenC.makeA();
		a.f();
		if (a instanceof C) {
			C c = (C) a;
			c.g();
		}
		callHidenMethod(a, "v");
	}
	
	static void callHidenMethod(Object a, String methodName) 
			throws Exception {
		Method g = a.getClass().getDeclaredMethod(methodName);
		g.setAccessible(true);
		g.invoke(a);
	}
	

}
