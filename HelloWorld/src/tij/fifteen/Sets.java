/**
 * 2018年11月26日
 */
package tij.fifteen;

import java.util.HashSet;
import java.util.Set;

/**
 * @author chengj
 */
public class Sets {
	public static <T> Set<T> union(Set<T> a, Set<T> b){
		Set<T> result = new HashSet<T>(a);
		result.addAll(b);
		return result;
	}
	
	public static <T> Set<T> intersection(Set<T> a, Set<T> b){
		Set<T> result = new HashSet<T>(a);
		result.retainAll(b);
		return result;
	}
	
	public static <T> Set<T> different(Set<T> a, Set<T> b){
		Set<T> result = new HashSet<T>(a);
		result.remove(b);
		return result;
	}
	
	public static <T> Set<T> complement(Set<T> a, Set<T> b){
		Set<T> result = new HashSet<T>(a);
		result.remove(b);
		return different(union(a, b), intersection(a, b));
	}
}
