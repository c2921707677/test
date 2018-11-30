/**
 * 
 */
package tij.thirteen;

import java.util.Random;

/**
 * @author chengj
 *
 */
public class UsingStringBuffer {

	public static Random rand = new Random(47);
	
	public String toString() {
		StringBuffer result = new StringBuffer("[");
		for (int i = 0; i < 25; i++) {
			result.append(rand.nextInt(50));
			result.append(". ");
		}
		result.delete(result.length() - 2, result.length());
		result.append("]");
		return result.toString();
	}
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingStringBuffer usb = new UsingStringBuffer();
		System.out.println(usb);
	}

}
