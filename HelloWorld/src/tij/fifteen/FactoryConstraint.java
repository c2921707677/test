/**
 * 2018年11月26日
 */
package tij.fifteen;

interface FactoryI<T> {
	T create();
}

class Foo2<T> {
	private T x;
	public <F extends FactoryI<T>> void foo2(F factory) {
		x = factory.create();
	}
}

class IntegerFactory implements FactoryI<Integer> {
	public Integer create() {
		return new Integer(0);
	}
}

class Widger {
	public static class Factory implements FactoryI<Widger> {
		public Widger create() {
			return new Widger();
		}
	}
}

/**
 * @author chengj
 */
public class FactoryConstraint {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Foo2<Integer>();
	}

}
