/**
 * 
 */
package tij.eleven;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @author chengj
 *
 */
public class TestQueue {

	public static void printQ(Queue q) {
		while (q.peek() != null) {
			System.out.print(q.remove() + ",");
		}
		System.out.println();
	}
	
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<Integer>();
		Random rand = new Random(47);
		for (int i = 0; i < 10; i++) {
			q.offer(rand.nextInt(10));
		}
		printQ(q);
		Queue<Character> qc = new LinkedList<Character>();
		for (char c : "asdjhsajd".toCharArray()) {
			qc.offer(c);
		}
		printQ(qc);
	}

}
