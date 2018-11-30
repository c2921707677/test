/**
 * 
 */
package tij.eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * @author chengj
 *
 */
public class TestIterator {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(1,2,3,4,5));
		ListIterator<Integer> it = list.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next() + "," + it.nextIndex() + 
					"," + it.previousIndex());
		}
		System.out.println();
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
		System.out.println();
		System.out.println(list);
		it = list.listIterator(2);
		while (it.hasNext()) {
			it.next();
			Integer i = Integer.valueOf("123");
			it.set(i);
		}
		System.out.println(list);
	}

}
