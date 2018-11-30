import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 */

/**
 * @author chengj
 *
 */
public class testRegularexpression {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String content = "abc";
		String pattern1 = "[a-z]{3}";
		boolean test1 = Pattern.matches(pattern1, content);
		System.out.println(test1);
		
		
		// 按指定模式在字符串查找
	    String line = "_abcdza1234a";
	    //	\w
	    //String pattern = "\\w(\\d\\d)(\\w+)";
	    String pattern = ".*a";
	    // 创建 Pattern 对象
	    Pattern r = Pattern.compile(pattern);
	    // 现在创建 matcher 对象
	    Matcher m = r.matcher(line);
		if (m.find()) {
			System.out.println(m.group());
		} else {
			System.out.println("error");
		}
		
		String str = "aa@aa.net.cn";
		String regex = "\\w+@\\w+\\.(com|net.cn)";
		System.out.println(str.matches(regex));
		
	}

}
