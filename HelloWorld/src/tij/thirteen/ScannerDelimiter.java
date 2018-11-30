/**
 * 
 */
package tij.thirteen;

import java.util.Scanner;

/**
 * @author chengj
 *
 */
public class ScannerDelimiter {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner("12. 213. 43. 213. 32. 23");
		s.useDelimiter("\\s*. \\s*");
		while (s.hasNextInt()) {
			System.out.println(s.nextInt());
		}
	}

}
