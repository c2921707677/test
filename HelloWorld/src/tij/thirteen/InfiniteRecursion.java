/**
 * 
 */
package tij.thirteen;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chengj
 *
 */
public class InfiniteRecursion {
	
	public String toString() {
		return "InfiniteRecursion address:" + super.toString() + "\n";
	}
	
	public static void main(String[] args) {
		List<InfiniteRecursion> ilists = 
				new ArrayList<InfiniteRecursion>();
		for (int i = 0; i < 10; i++) {
			ilists.add(new InfiniteRecursion());
		}
		System.out.println(" a  bac sds ".intern());
		int x = 5;
		double y = 1.232;
		System.out.format("row 1:[%d %f]\n", x, y);
	}
}
