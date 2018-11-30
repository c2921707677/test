/**
 * 2018年11月26日
 */
package tij.fifteen;

import java.awt.List;
import java.util.Map;

import tij.eleven.New;
import tij.fourteen.Person;

/**
 * @author chengj
 */
public class ExplicitTypeSpecification {
	
	static void f(Map<Person, Integer> intperson) {}
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(New.<Person, Integer>map());
	}

}
