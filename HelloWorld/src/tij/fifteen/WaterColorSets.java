/**
 * 2018年11月26日
 */
package tij.fifteen;

import java.util.EnumSet;
import java.util.Set;

import static tij.fifteen.Sets.*;
import static tij.fifteen.Watercolors.*;

/**
 * @author chengj
 */
public class WaterColorSets {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Watercolors> set1 = EnumSet.range(
				BRILIANT_RED, VIRIDIAN_HUE);
		Set<Watercolors> set2 = EnumSet.range(
				CERULEAN_BLUE_HUE, BURNT_UMBER);
		System.out.println("set1:" + set1);
		System.out.println("set2:" + set2);
		System.out.println("union(set1,set2):" + union(set1,set2));
		Set<Watercolors> subset = intersection(set1, set2);
		System.out.println("intersection(set1, set2):" + subset);
		System.out.println("different(set1, subset):" + different(set1, subset));
		System.out.println("different(set2, subset):" + different(set2, subset));
		System.out.println("complement(set1, set2):" + complement(set1, set2));
	}

}
