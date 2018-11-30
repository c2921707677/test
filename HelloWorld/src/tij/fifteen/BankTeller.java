/**
 * 2018年11月26日
 */
package tij.fifteen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

class Customer {
	private static long counter = 1;
	private final long id = counter++;
	private Customer() {}
	public String toString() {return "Customer" + id;}
	public static Generator<Customer> generator() {
		return new Generator<Customer>() {
			
			@Override
			public Customer next() {
				// TODO Auto-generated method stub
				return new Customer();
			}
		};
	}
}

class Teller {
	private static long counter = 1;
	private final long id = counter++;
	private Teller() {}
	public String toString() {return "Teller" + id;}
	public static Generator<Teller> generator() {
		return new Generator<Teller>() {
			
			@Override
			public Teller next() {
				// TODO Auto-generated method stub
				return new Teller();
			}
		};
	}
}

/**
 * @author chengj
 */
public class BankTeller {

	public static void serve(Teller t, Customer c) {
		System.out.println(t + " serves " + c);
	}
	
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(46);
		Queue<Customer> line = new LinkedList<Customer>();
		Generators.fill(line, Customer.generator(), 15);
		List<Teller> tellers = new ArrayList<Teller>();
		Generators.fill(tellers, Teller.generator(), 4);
		for (Customer c : line) {
			serve(tellers.get(rand.nextInt(tellers.size())), c);
			
		}
	}

}
