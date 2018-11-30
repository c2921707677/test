/**
 * 
 */
package tij.fourteen;

/**
 * @author chengj
 *
 */

class Candy {
	static {
		System.out.format("Loading %s\n", Candy.class.getSimpleName());
	}
}

class Gum {
	static {
		System.out.format("Loading %s\n", Gum.class.getSimpleName());
	}
}

class Cookie {
	static {
		System.out.format("Loading %s\n", Cookie.class.getSimpleName());
	}
}

public class SweetShop {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inside main");
		new Candy();
		System.out.println("after creating Candy");
		try {
			Class.forName("Gum");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("couldn't find Gum");
		}
		System.out.println("After Class.forName(\"Gum\");");
		new Cookie();
		System.out.println("after creating Cookie");
	}

}
