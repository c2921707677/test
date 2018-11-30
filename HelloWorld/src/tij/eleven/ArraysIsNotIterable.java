/**
 * 
 */
package tij.eleven;

import java.util.Arrays;

/**
 * @author chengj
 *
 */
public class ArraysIsNotIterable {

	/**
	 * @param argsvoid
	 */
	
	static <T> void test(Iterable<T> ib) {
		for (T t : ib) {
			System.out.print(t + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(Arrays.asList(1,2,3));
		
		String[] strs = {"a","b","c"};
		test(Arrays.asList(strs));
		
	}

}
