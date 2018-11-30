/**
 * 
 */
package tij.thirteen;

/**
 * @author chengj
 *
 */
public class Hex {

	public static String format(byte[] data) {
		StringBuffer result = new StringBuffer();
		int n = 0;
		for (byte b : data) {
			if (n%16 == 0)
				result.append(String.format("%05x: ", n));
			result.append(String.format("%02x", b));
			n++;
			if (n%16 == 0)
				result.append("\n");
		}
		result.append("\n");
		return result.toString();
	}
	
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean a = "abcabcabc".matches("(abc)+");
		System.out.println(a);
	}

}
