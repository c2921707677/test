/**
 * 
 */

/**
 * @author chengj
 *
 */
public class testJSON {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new subGlaph(5);
	}

}

class Glaph {
	private void draw() {
		System.out.println("Glaph draw");
	}
	
	Glaph() {
		System.out.println("before Glaph draw");
		draw();
		System.out.println("after Glaph draw");
	}
}

class subGlaph extends Glaph{
	private int radius = 1;
	subGlaph(int r) {
		System.out.println("subGlaph");
		radius = r;
		System.out.println("subGlaph.subGlaph().radius = " + radius);
	}
	private void draw() {
		System.out.println("subGlaph.draw().radius = " + radius);
	}
}
