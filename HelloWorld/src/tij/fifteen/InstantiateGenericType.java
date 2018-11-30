/**
 * 2018年11月26日
 */
package tij.fifteen;

class ClassAsFactory<T> {
	T x;
	public ClassAsFactory(Class<T> kind) {
		try {
			x = kind.newInstance();
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException();
		}
	}
}

class Employee {}

/**
 * @author chengj
 */
public class InstantiateGenericType {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassAsFactory<Employee> fe = 
				new ClassAsFactory(Employee.class);
		System.out.println("classasfactory<Employee> success");
		try {
			ClassAsFactory<Integer> fi = 
					new ClassAsFactory(Integer.class);
			System.out.println("classasfactory<Employee> success");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("classasfactory<Employee> fail");
		}
	}

}
