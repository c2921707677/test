/**
 * 
 */
package tij.tweleve;

/**
 * @author chengj
 *
 */

class OnOffException1 extends Exception{}

class OnOffException2 extends Exception{}

class Switch {
	private boolean state = false;
	
	public boolean read() {return this.state;}
	
	public void on() {state = true; System.out.println(this);}
	
	public void off() {state = false; System.out.println(this);}
	
	public String toString() {return state?"on":"off";}
}

public class OnOffSwtich {
	private static Switch sw = new Switch();
	public static void f() 
		throws OnOffException1, OnOffException2 {}
	
	public static void main(String[] args) {
		try {
			sw.on();
			f();
			sw.off();
		} catch (OnOffException1 e2) {
			// TODO: handle exception
			System.out.println("OnOffException1");
			sw.off();
		} catch (OnOffException2 e1) {
			// TODO: handle exception
			System.out.println("OnOffException2");
			sw.off();
		}
	}
	
}
