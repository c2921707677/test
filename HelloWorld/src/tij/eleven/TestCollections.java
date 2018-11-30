/**
 * 
 */
package tij.eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author chengj
 *
 */
public class TestCollections {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> collection = 
				new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		Integer[] moreInts = {6,7,8,9,10};
		collection.addAll(Arrays.asList(moreInts));
		Collections.addAll(collection, 11,12,13,14,15);
		Collections.addAll(collection, moreInts);
		for (Integer integer : collection) {
			System.out.println(integer);
		}
		
		List<Integer> list = Arrays.asList(16,17,18,19,20);
		list.set(1, 99);
		System.out.println(list);
		
		String s1 = "abc";
		String s2 = "ab" + "c";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
	}

}
