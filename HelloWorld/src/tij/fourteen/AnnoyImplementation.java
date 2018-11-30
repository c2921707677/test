/**
 * 2018年11月23日
 */
package tij.fourteen;

class AnnoymousA {
	public static A makeA() {
		return new A() {
			@Override
			public void f() {
				// TODO Auto-generated method stub
				System.out.println("C.f");
			}
			public void g() {
				System.out.println("c.g");
			}
			void u() {
				System.out.println("c.u");
			}
			protected void v() {
				System.out.println("c.v");
			}
			
			private void w() {
				System.out.println("c.w");
			}
		};
	}
}

/**
 * @author chengj
 */
public class AnnoyImplementation {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		A a = AnnoymousA.makeA();
		a.f();
		System.out.println(a.getClass().getName());
		HidenImplementation.callHidenMethod(a, "g");
	}

}
