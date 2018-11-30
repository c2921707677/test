/**
 * 
 */
package tij.tweleve;

/**
 * @author chengj
 *
 */

class MyException2 extends Exception {
	private int x;
	public MyException2() {}
	public MyException2(String string) {
		super(string);
	}
	public MyException2(String string, int x) {
		super(string);
		this.x = x;
	}
	public int val() {
		return x;
	}
	public String getMessage() {
		return "Detail Message:" + x + " " + super.getMessage();
	}
}

public class ExtraFeatures {

	public static void f() throws MyException2 {
		System.out.println("throws MyException2 from f");
		throw new MyException2();
	}
	public static void g() throws MyException2 {
		System.out.println("throws MyException2 from G");
		throw new MyException2("Originated in g()");
	}
	public static void h() throws MyException2 {
		System.out.println("throws MyException2 from H");
		throw new MyException2("Originated in g()", 47);
	}
	
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			f();
		} catch (MyException2 e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		}
		
		try {
			g();
		} catch (MyException2 e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		}
		System.out.println("\n\n\n");
		try {
			h();
		} catch (MyException2 e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
			System.out.println("e.val : " + e.val());
			System.out.println("chengj : " + e.getMessage());
			System.out.println("chengj : " + e.getLocalizedMessage());
			System.out.println("chengj : " + e);
		}
		
	}

}
