/**
 * 2018年11月26日
 */
package tij.fifteen;

/**
 * @author chengj
 */
public class CountedObject {
	public static long counter = 0;
	public final long id = counter++;
	public long id() {
		return id;
	}
	public String toString() {
		return "CountedObject " + id;
	}
}
