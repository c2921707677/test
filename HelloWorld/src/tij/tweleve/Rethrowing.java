/**
 * 
 */
package tij.tweleve;

/**
 * @author chengj
 *
 */
public class Rethrowing {

	public static void f() throws Exception {
		System.out.println("originating the exception from f()");
		throw new Exception("exception from f");
	}
	
	public static void g() throws Exception {
		try {
			f();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("inside g, e.pringStackTrace");
			e.printStackTrace(System.out);
			throw e;
		}
	}
	
	public static void h() throws Exception {
		try {
			f();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("inside h, e.pringStackTrace");
			e.printStackTrace(System.out);
			throw (Exception)e.fillInStackTrace();
		}
	}
	
	
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			g();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("main g: printStackTrace");
			e.printStackTrace(System.out);
		}
		
		try {
			h();	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("main h: printStackTrace");
			e.printStackTrace(System.out);
		}
	}

}
