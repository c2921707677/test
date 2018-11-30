/**
 * 
 */
package tij.eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @author chengj
 *
 */
public class ModifyingArraysAsList {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		Integer[] ia = {1,2,3,4,5,6,7};
		List<Integer> list1 = 
				new ArrayList<Integer>(Arrays.asList(ia));
		System.out.println("before:" + list1);
		Collections.shuffle(list1, rand);
		System.out.println("after:" + list1);
		System.out.println("array:" + Arrays.toString(ia));
		
		
		List<Integer> list2 = Arrays.asList(ia);
		System.out.println("before:" + list2);
		Collections.shuffle(list2, rand);
		System.out.println("after:" + list2);
		System.out.println("array:" + Arrays.toString(ia));
	}

}
