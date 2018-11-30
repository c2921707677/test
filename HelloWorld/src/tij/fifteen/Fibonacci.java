/**
 * 2018年11月26日
 */
package tij.fifteen;

/**
 * @author chengj
 */
public class Fibonacci implements Generator<Integer> {

	private int count = 0;
	private int fib(int n) {
		
		if (n < 2)
			return 1;
		return fib(n - 1) + fib(n - 2);
	}
	
	/* (non-Javadoc)
	 * @see tij.fifteen.Generator#next()
	 */
	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		System.out.println("fib:" + count);
		return fib(count++);
	}
	
	public static void main(String[] args) {
		Fibonacci g = new Fibonacci();
		for (int i = 0; i < 18; i++) {
			System.out.print(g.next() + " ");
		}
	}

}
