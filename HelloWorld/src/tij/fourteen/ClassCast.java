/**
 * 
 */
package tij.fourteen;

class Building {
	public Building() {
		System.out.println("Building constructor");
	}
}

class House extends Building {
	public House() {
		System.out.println("House constructor");
	}
}

public class ClassCast {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Building b = new House();
		Class<House> houseType = House.class;
		House h = houseType.cast(b);
		h = (House)b;
	}

}
