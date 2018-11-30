/**
 * 
 */
package tij.tweleve;

/**
 * @author chengj
 *
 */

class SimpleException extends Exception {}

public class InheritingExceptions {
	
	public void f() throws SimpleException{
		System.out.println("throws simpleexception from f()");
		throw new SimpleException();
	}
	
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritingExceptions ie = new InheritingExceptions();
		try {
			ie.f();
		} catch (SimpleException e) {
			// TODO: handle exception
			System.out.println("caught it");
		}
	}

}
