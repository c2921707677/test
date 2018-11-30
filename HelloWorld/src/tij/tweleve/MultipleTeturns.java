/**
 * 
 */
package tij.tweleve;

/**
 * @author chengj
 *
 */
public class MultipleTeturns {

	public static void f(int i) {
		System.out.println("init");
		try {
			System.out.println("point 1");
			if (i == 1) return ;
			if (i == 2) return ;
		} finally {
			// TODO: handle finally clause
			System.out.println("performing cleanup");
		}
	}
	
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {
			f(i);
		}
	}

}
