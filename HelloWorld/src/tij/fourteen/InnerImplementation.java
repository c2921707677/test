/**
 * 2018年11月23日
 */
package tij.fourteen;

class InnerA{
	private static class C implements A{

		/* (non-Javadoc)
		 * @see tij.fourteen.A#f()
		 */
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
		
		
	}
	public static A makeA() {
		return new C();
	}
}

/**
 * @author chengj
 */
public class InnerImplementation {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		A a = InnerA.makeA();
		a.f();
		HidenImplementation.callHidenMethod(a, "g");
		HidenImplementation.callHidenMethod(a, "u");
		HidenImplementation.callHidenMethod(a, "v");
		HidenImplementation.callHidenMethod(a, "w");
		
	}

}
