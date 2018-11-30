/**
 * 2018年11月26日
 */
package tij.fifteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Frob {}
class Fnorkle {}
class Quark<Q> {}
class Particle<POSITION, MOMENTUM> {}

class Test {
	public Test(int a) {}
}
/**
 * @author chengj
 */
public class LostInformation {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Frob> list = new ArrayList<Frob>();
		Map<Frob, Fnorkle> map = new HashMap<Frob, Fnorkle>();
		Quark<Fnorkle> quark = new Quark<Fnorkle>();
		Particle<Long, Double> p = new Particle<Long, Double>();
		Test t = new Test(1);
		System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(p.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(t.getClass().getTypeParameters()));
	}

}
