/**
 * 2018年11月26日
 */
package tij.fifteen;

class Amphibian {}
class Vehicle {}

/**
 * @author chengj
 */
public class TupleTest {

	static TwoTuple f() {
		return new TwoTuple("hi", 56);
	}
	
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoTuple t1 = f();
//		t1.first = "sdasd";
		System.out.println(t1);
	}

}
