/**
 * 2018年11月23日
 */
package tij.fourteen;

import java.util.List;

/**
 * @author chengj
 */
public interface Robot {
	String name();
	String model();
	List<Operation> operations();
	class Test {
		public static void test(Robot r) {
			if (r instanceof Null) {
					System.out.println("[Null Robot]");
			}
			System.out.println("Robot name:" + r.name());
			System.out.println("Robot model:" + r.model());
			for (Operation o : r.operations()) {
				System.out.println(o.description());
				o.command();
			}
		}
	}
}
