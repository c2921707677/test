/**
 * 
 */
package tij.eleven;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author chengj
 *
 */
public class TestSet {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	test1
//		HashSet hs = new HashSet(); 
//		hs.add("a"); 
//		hs.add("a"); 
//		hs.add("b"); 
//		hs.add("c"); 
//		hs.add("d"); 
//		hs.parallelStream().forEach(x -> System.out.println(x)); 
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		for (Object object : hs) { 
//			System.err.println(object); 
//		}
		
		
//test2		
//		Random rand = new Random(47);
//		SortedSet<Integer> intset = new TreeSet<Integer>();
//		for (int i = 0; i < 10000; i++) {
//			intset.add(rand.nextInt(30));
//		}
//		System.out.println(intset);

	
		Set<String> set1 = new HashSet<String>();
		Collections.addAll(set1, "A B C D E F G H I J K L M".split(" "));
		set1.add("o");
	
	}
	
}
