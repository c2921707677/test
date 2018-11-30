/**
 * 2018年11月26日
 */
package tij.fifteen;

class Automobile {}

/**
 * @author chengj
 */
public class Holder1 {
	private Automobile a;
	public Holder1(Automobile a) {
		this.a = a;
	}
	
	Automobile get() {
		return this.a;
	}
}
