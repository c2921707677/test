/**
 * 2018年11月23日
 */
package tij.fourteen;

class C implements A {

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

/**
 * @author chengj
 */
public class HiddenC {
	public static A makeA() {
		return new C();
	}
}
