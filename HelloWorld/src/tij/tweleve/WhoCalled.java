/**
 * 
 */
package tij.tweleve;

/**
 * @author chengj
 *
 */
public class WhoCalled {

	static void f() {
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
			for (StackTraceElement ste : e.getStackTrace()) {
				System.out.println(ste);
			}
		}
	}
	
	static void g() { f(); }
	
	static void h() { g(); }
	
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f();
		System.out.println("------------------------------");
		g();
		System.out.println("------------------------------");
		h();
	}

}
