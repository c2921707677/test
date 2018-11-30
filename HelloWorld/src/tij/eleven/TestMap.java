/**
 * 
 */
package tij.eleven;

import java.util.Map;

/**
 * @author chengj
 *
 */
public class TestMap {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Map.Entry entry : System.getenv().entrySet()) {
			System.out.println(entry.getKey() + ":" 
					+ entry.getValue());
		}
	}

}
