/**
 * 2018年11月26日
 */
package tij.fifteen;

import java.util.Collection;

/**
 * @author chengj
 */
public class Generators {
	public static <T> Collection<T> fill(
			Collection<T> coll, Generator<T> gen, int n) {
		for (int i = 0; i < n; i++) {
			coll.add(gen.next());
		}
		return coll;
	}
	
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
