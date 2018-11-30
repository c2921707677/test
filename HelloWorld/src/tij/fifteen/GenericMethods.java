/**
 * 2018年11月26日
 */
package tij.fifteen;

/**
 * @author chengj
 */
public class GenericMethods {
	public <T> void f(T... x) {
		for (T t : x) {
			System.out.print(x.getClass().getName() + " ");
		}
		System.out.println();
//		System.out.println(x.getClass().getName());
	}
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethods gm = new GenericMethods();
		gm.f("");
		gm.f(1, 1.23f);
		gm.f(1.23);
		gm.f(gm);
	}

}
