/**
 * 2018年11月26日
 */
package tij.fifteen;

import java.util.Random;

/**
 * @author chengj
 */
public class LinkedStack<T> {

	private static class Node<U> {
		U item;
		Node<U> next;
		/**
		 * 
		 */
		public Node() {
			item = null;
			next = null;
		}
		Node(U item, Node<U> next) {
			this.item = item;
			this.next = next;
		}
		boolean end() {
			return item == null && next == null;
		}
	}
	
	private Node<T> top = new Node<>();
	public void push(T item) {
		top = new Node<T>(item, top);
	}
	
	public T pop() {
		T result = top.item;
		if (!top.end()) {
			top = top.next;
		}
		return result;
	}
	
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedStack<String> lss = new LinkedStack<String>();
		for (String s: "life is short, i use python!".split(" ")) {
			lss.push(s);
		}
		String s;
		while ((s = lss.pop()) != null) {
			System.out.println(s);
		}
		
		Random rand = new Random(47);
		for(int i = 0; i < 11; i++) {
			System.out.println(rand.nextInt(11));
		}
	}

}
