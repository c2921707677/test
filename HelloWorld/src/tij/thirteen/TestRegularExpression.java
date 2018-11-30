/**
 * 
 */
package tij.thirteen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author chengj
 *
 */
public class TestRegularExpression {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Arline ate eight apples and one orange while Anita hadn't any";
		String pattern = "(?i)((^[aeiou])|(\\\\s+[aeiou]))\\\\W+?[aeiou]\\\\b";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(input);
		if (m.find()) {
			System.out.println("found");
			System.out.println(m.group());
		}
		else 
			System.out.println("not found");
	}

}
