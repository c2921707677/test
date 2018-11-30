/**
 * 2018年11月26日
 */
package tij.fifteen;

/**
 * @author chengj
 */
public class TwoTuple<A, B> {
	public final A first;
	public final B second;
	public TwoTuple(A a, B b) {
		first = a;
		second = b;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TwoTuple [first=" + first + ", second=" + second + "]";
	}
	
}
