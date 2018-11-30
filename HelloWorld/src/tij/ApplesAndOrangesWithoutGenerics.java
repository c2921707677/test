/**
 * 
 */
package tij;

import java.util.ArrayList;

/**
 * @author chengj
 *
 */


class Apple {
	private static long counter;
	
	private final long id = counter++;
	public void id() {
		System.out.println(this.id);
	}
}

class Oranges {}

public class ApplesAndOrangesWithoutGenerics {

	/**
	 * @param argsvoid
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList apples = new ArrayList();
		for (int i = 0; i < 3; i++) {
			apples.add(new Apple());
		}
		apples.add(new Oranges());
		for (int i = 0; i < apples.size(); i++) {
			((Apple)apples.get(i)).id();
		}
	}

}
