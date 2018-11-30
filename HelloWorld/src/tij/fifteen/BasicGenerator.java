/**
 * 2018年11月26日
 */
package tij.fifteen;

/**
 * @author chengj
 * @param <T>
 */
public class BasicGenerator<T> implements Generator<T> {
	private Class<T> type;
	public BasicGenerator(Class<T> type) {
		this.type = type;
	}
	
	public T next() {
		try {
			return type.newInstance();
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException();
		}
	}
	public static <T> Generator<T> create(Class<T> type) {
		return new BasicGenerator<T>(type);
	}
	
}
