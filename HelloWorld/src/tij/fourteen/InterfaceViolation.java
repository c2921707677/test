/**
 * 2018年11月23日
 */
package tij.fourteen;

class B implements A {
	public void f() {};
	public void g() {};
}

/**
 * @author chengj
 */
public class InterfaceViolation {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		a.f();
//		a.g();
		System.out.println(a.getClass().getName());
		if (a instanceof B) {
			B b = (B) a;
			b.g();
		}
	}

}
