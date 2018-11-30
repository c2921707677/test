/**
 * 
 */
package tij.thirteen;

import java.util.Scanner;

/**
 * @author chengj
 *
 */
public class BetterRead {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = stdin.nextLine();
		System.out.println(name);
		System.out.println(
				"How old are you? what is your favorite double?");
		System.out.println("(input:<age> <double>)");
		int age = stdin.nextInt();
		
		double favorite = stdin.nextDouble();
		System.out.format("Hi %s\n", name);
		System.out.format("in five years you will be %d.\n", age + 5);
		System.out.format("My favorite double is %f.\n", favorite / 2);
	}

}
