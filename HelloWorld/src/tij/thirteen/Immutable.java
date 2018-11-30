/**
 * 
 */
package tij.thirteen;

/**
 * @author chengj
 *
 */
public class Immutable {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abc";
		String b = a;
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		//a = a + "efg";
		if (a.equals("abc"))
		System.out.println(a.equals("abc"));
		
	}

}
