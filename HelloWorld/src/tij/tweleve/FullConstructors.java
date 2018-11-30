/**
 * 
 */
package tij.tweleve;

/**
 * @author chengj
 *
 */

class MyException extends Exception {
	public MyException() {}
	public MyException(String msg) {
		super(msg);
	}
}

public class FullConstructors {

	public static void f() throws MyException {
		System.out.println("throws myexception from f");
		throw new MyException();
	}
	
	public static void g() throws MyException {
		System.out.println("throws myexception from g");
		throw new MyException("originated in g");
	}
	
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			f();
		} catch (MyException e) {
			// TODO: handle exception
			e.printStackTrace(System.err);
		}
		try {
			g();
		} catch (MyException e) {
			// TODO: handle exception
			e.printStackTrace(System.err);
		}
	}

}
