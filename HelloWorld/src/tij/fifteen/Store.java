/**
 * 2018年11月26日
 */
package tij.fifteen;

import java.util.ArrayList;
import java.util.Random;

class Product {
	private final int id;
	private String description;
	private double price;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [id=" + id + ", description=" + description + ", price=" + price + "]";
	}
	/**
	 * @param id
	 * @param description
	 * @param price
	 */
	public Product(int id, String description, double price) {
		super();
		this.id = id;
		this.description = description;
		this.price = price;
	}
	public void priceChange(double change) {
		price += change;
	}
	public static Generator<Product> generator = 
			new Generator<Product>() {
				private Random rand = new Random(46);
				@Override
				public Product next() {
					// TODO Auto-generated method stub
					return new Product(rand.nextInt(1000), "Test", 
							Math.round(rand.nextDouble()*1000.0) + 0.99);
				}
			};
}

class Shelf extends ArrayList<Product> {
	public Shelf(int nProducts) {
		Generators.fill(this, Product.generator, nProducts);
	}
}

class Asile extends ArrayList<Shelf> {
	public Asile(int nAsile, int nProducts) {
		for (int i = 0; i < nAsile; i ++) {
			add(new Shelf(i));
		}
	}
}

class CheckoutStand {}
class Office {}

/**
 * @author chengj
 */
public class Store extends ArrayList<Asile>{

	private ArrayList<CheckoutStand> css = new ArrayList<CheckoutStand>();
	private Office office = new Office();
	
	public Store(int nAisles, int nShelves, int nProducts) {
		for (int i = 0; i < nAisles; i++) {
			add(new Asile(nShelves, nProducts));
		}
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		for(Asile a: this){
			for(Shelf s: a) {
				for (Product p : s) {
					result.append(p);
					result.append("\n");
				}
			}
		}
		return result.toString();
	}
	
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Store(2, 2, 2));
	}

}
