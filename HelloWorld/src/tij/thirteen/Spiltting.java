/**
 * 
 */
package tij.thirteen;

import java.util.Arrays;

/**
 * @author chengj
 *
 */
public class Spiltting {

	public static String knights = 
			"Then, when you have found the shrubbery, you must " + 
			"cut down the mightiest tree in the forest... " + 
			"with... a herring!";
	
	public static void split(String regex) {
		System.out.println(Arrays.toString(knights.split(regex)));
	}
	
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		split(" ");
		split("\\W+");
		split("n\\W+");
	}

}
