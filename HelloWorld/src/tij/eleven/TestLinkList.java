/**
 * 
 */
package tij.eleven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author chengj
 *
 */
public class TestLinkList {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.addAll(Arrays.asList(1,2,3,4,5));
		System.out.println(list);
		System.out.println("list.getFirst:" + list.getFirst());
		System.out.println("list.element:" + list.element());
		System.out.println("list.peek:" + list.peek());
		System.out.println("list.remove:" + list.remove());
		System.out.println("list.removeFirst:" + list.removeFirst());
		System.out.println("list.poll:" + list.poll());
		System.out.println(list);
		list.addFirst(new Integer(6));
		System.out.println("after addfirst:" + list);
		list.offer(new Integer(7));
		System.out.println("after offer:" + list);
		list.add(new Integer(8));
		System.out.println("after add:" + list);
		list.addLast(new Integer(9));
		System.out.println("after addlast: " + list);
		System.out.println("list.removeLast:" + list.removeLast());
		System.out.println("after removeLast: " + list);
	}

}
