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
public class ReFlages {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("^java", 
				Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
		Matcher m = p.matcher(
				"java has regex\nJava has regex\n"
				+ "JAVA has pretty good regular expression\n"
				+ "Regular expression are in Java");
		StringBuffer sbuf = new StringBuffer();

		System.out.println(sbuf);
		while (m.find()) {
			System.out.println(m.group());
			m.appendReplacement(sbuf, "abc");
			System.out.println(sbuf);
		}
//		System.out.println(sbuf);
//		m.appendTail(sbuf);
//		System.out.println(sbuf);
	}

}
