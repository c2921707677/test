package tij.fourteen;

/**
 * @author chengj
 *
 */

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
	public Toy() {
		// TODO Auto-generated constructor stub
	}
	public Toy(int i) {
		// TODO Auto-generated constructor stub
	}
}

class FancyToy extends Toy
	implements HasBatteries, Waterproof, Shoots {
	/**
	 * 
	 */
	public FancyToy() {
		super(1);
	}
}

public class ToyTest {

	static void printInfo(Class cc) {
		System.out.println("Class name: " + cc.getName() + 
				" is interface?[" + cc.isInterface() + "]");
		System.out.println("Simple name: " + cc.getSimpleName());
		System.out.println("Canonical name: " + cc.getCanonicalName());
		System.out.println();
	}
	
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c = null;
		try {
			c = Class.forName("tij.fourteen.FancyToy");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("can't find FancyToy");
		}
		printInfo(c);
		for (Class face : c.getInterfaces()) {
			System.out.println(face);
		}
		Class up = c.getSuperclass();
		Object obj = null;
		try {
			obj = up.newInstance();
		} catch (InstantiationException e) {
			// TODO: handle exception
			System.out.println("cannot instantia");
		} catch (IllegalAccessException e) {
			// TODO: handle exception
			System.out.println("cannot access");
		}
		printInfo(obj.getClass());
		System.out.println();
		System.out.println(Integer.TYPE);
	}

}
