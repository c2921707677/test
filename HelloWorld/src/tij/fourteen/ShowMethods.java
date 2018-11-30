/**
 * 
 */
package tij.fourteen;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * @author chengj
 *
 */
public class ShowMethods {
	
	private static String usage = ""
			+ "usage \n"
			+ "ShowMethods qualified class.name \n"
			+ "To show all methods in class or: \n"
			+ "ShowMethods qualified clas.name word\n"
			+ "To search for methods involving word.";
	
//	private static Pattern p = Pattern.compile("(native )|(final )+");
	private static Pattern p = Pattern.compile("\\w+\\.");
	/*
	 * 
public static void tij.fourteen.ShowMethods.main(java.lang.String[])
public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
public final void java.lang.Object.wait() throws java.lang.InterruptedException
public boolean java.lang.Object.equals(java.lang.Object)
public java.lang.String java.lang.Object.toString()
public native int java.lang.Object.hashCode()
public final native java.lang.Class java.lang.Object.getClass()
public final native void java.lang.Object.notify()
public final native void java.lang.Object.notifyAll()
pubc j.our.ShowMhods()
	 * */
	
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lines = 0;
		try {
			Class<?> c = Class.forName("tij.fourteen.ShowMethods");
			Method[] methods = c.getMethods();
			Constructor[] ctors = c.getConstructors();
			for (Method method : methods) {
//				System.out.println(method.toString());
				System.out.println(p.matcher(method.toString()).replaceAll(""));
			}
			for (Constructor constructor : ctors) {
				System.out.println(p.matcher(constructor.toString()).replaceAll(""));
			}
			lines = methods.length + ctors.length;
			System.out.println(lines);
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}

	}

}
