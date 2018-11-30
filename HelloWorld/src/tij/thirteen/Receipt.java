/**
 * 
 */
package tij.thirteen;

import java.util.Formatter;

/**
 * @author chengj
 *
 */
public class Receipt {

	private double total = 0;
	
	private Formatter f = new Formatter(System.out);
	
	public void printTitle() {
		f.format("%-15s %5s %10s\n", "item", "qty", "price");
		f.format("%-15s %5s %10s\n", "----", "---", "-----");
	}
	
	public void print(String name, int qty, double d) {
		f.format("%-15.15s %5d %10.2f\n", name, qty, d);
		total += d;
	}
	
	public void printTotal() {
		f.format("%-15s %5s %10.2f\n", "Tax", "", total*0.96);
		f.format("%-15s %5s %10s\n", "", "", "-----");
		f.format("%-15s %5s %10.2f\n", "total", "", total*1.06);
	}
			
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receipt receipt = new Receipt();
		receipt.printTitle();
		receipt.print("Jack's magic Beans", 4, 4.25);
		receipt.print("Princess Peas", 3, 5.1);
		receipt.print("Three Bears Porridge", 1, 14.29);
		receipt.printTotal();
		
	}

}
