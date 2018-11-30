/**
 * 
 */
package tij.thirteen;

import java.io.PrintStream;
import java.util.Formatter;

/**
 * @author chengj
 *
 */
public class Turtle {
	
	private String name;
	private Formatter f;
	
	public Turtle(String name, Formatter f) {
		this.name = name;
		this.f = f;
	}
	
	public void move(int x, int y) {
		f.format("%s the turtle is at (%d,%d)\n", name, x, y);
	}

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream outAlias = System.out;
		Turtle tommy = new Turtle("Tommy", new Formatter(System.out));
		Turtle jerry = new Turtle("jerry", new Formatter(outAlias));
		tommy.move(0, 0);
		jerry.move(1, 1);
		tommy.move(2, 2);
		jerry.move(2, 3);
		tommy.move(5, 1);
		jerry.move(5, 2);
		tommy.move(1, 7);
		jerry.move(5, 1);
		
	}

}
