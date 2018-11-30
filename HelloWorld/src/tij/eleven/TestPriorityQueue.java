/**
 * 
 */
package tij.eleven;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

/**
 * @author chengj
 *
 */
public class TestPriorityQueue {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> priorityQueue = 
				new PriorityQueue<Integer>();
		Random rand = new Random(1);
		for (int i = 0; i < 10; i++) {
			priorityQueue.offer(rand.nextInt(10));
		}
		TestQueue.printQ(priorityQueue);
		List<Integer> ints = Arrays.asList(11,12,13,14,15,16,17,18,19,20);
		priorityQueue = new PriorityQueue<Integer>(ints);
		TestQueue.printQ(priorityQueue);
		priorityQueue = new PriorityQueue<Integer>(
				ints.size(), Collections.reverseOrder());
		ints = Arrays.asList(1,2,3,4,5,4,3,2,1);
		priorityQueue.addAll(ints);
		TestQueue.printQ(priorityQueue);
		
		
		String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
		List<String> strings = Arrays.asList(fact.split(""));
		PriorityQueue<String> stringPQ = 
				new PriorityQueue<String>(strings);
		System.out.println(priorityQueue);
		//TestQueue.printQ(priorityQueue);
		stringPQ = 
				new PriorityQueue<String>(strings.size(), Collections.reverseOrder());
		stringPQ.addAll(strings);
		TestQueue.printQ(priorityQueue);
		
		
		Set<Character> cSet = new HashSet<Character>();
		for (char c : fact.toCharArray()) {
			cSet.add(c);
		}
		PriorityQueue<Character> c = 
				new PriorityQueue<Character>(cSet);
		TestQueue.printQ(priorityQueue);
	}

}
