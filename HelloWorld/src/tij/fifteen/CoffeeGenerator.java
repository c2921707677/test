/**
 * 2018年11月26日
 */
package tij.fifteen;

import java.util.Iterator;
import java.util.Random;

import tij.fifteen.Coffees.*;

/**
 * @author chengj
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

	private Class[] types = {Latte.class, Mocha.class, Cappuccino.class,
			Americano.class, Breve.class};
	
	private static Random rand = new Random(47);
	
	public CoffeeGenerator() {}
	
	private int size = 0;

	public CoffeeGenerator(int size) {
		super();
		this.size = size;
	}

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeGenerator gen = new CoffeeGenerator();
		try {
			System.out.println((Coffee)gen.types[rand.nextInt(gen.types.length)].newInstance());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(gen.next());
		}
		for (Coffee coffee : new CoffeeGenerator(5)) {
			System.out.println(coffee);
		}
	}
	
	class CoffeeIterator implements Iterator<Coffee> {

		int count = size;
		public boolean hasNext() {
			return count > 0;
		}
		
		public Coffee next() {
			count --;
			return CoffeeGenerator.this.next();
		}
		
		public void remove() {
			throw new UnsupportedOperationException();
		}
	};

	/* (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<Coffee> iterator() {
		// TODO Auto-generated method stub
		return new CoffeeIterator();
	}

	/* (non-Javadoc)
	 * @see tij.fifteen.Generator#next()
	 */
	@Override
	public Coffee next() {
		// TODO Auto-generated method stub
		try {
			return (Coffee)types[rand.nextInt(types.length)].newInstance();
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException();
		}
	}

}
