/**
 * 
 */
package tij.eleven;

import java.util.Stack;

/**
 * @author chengj
 *
 */
public class TestStack {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		for (String string : "my dog has two legs".split(" ")) {
			stack.push(string);
		}
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		
	}

}
