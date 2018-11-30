/**
 * 2018年11月26日
 */
package tij.eleven;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chengj
 */
public class New {

	public static <K, V> Map<K, V> map() {
		return new HashMap<K, V>();
	}
	public static <B> ArrayList<B> list() {
		return new ArrayList<B>();
	}
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, ArrayList<String>> sls = New.map();
	}

}
