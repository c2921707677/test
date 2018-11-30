/**
 * 2018年11月26日
 */
package tij.fifteen;

/**
 * @author chengj
 */
public class Coffee {
	private static long counter = 0;
	private final long id = counter++;
	public String toString() {
		return getClass().getSimpleName() + " " + id;
	}
}
