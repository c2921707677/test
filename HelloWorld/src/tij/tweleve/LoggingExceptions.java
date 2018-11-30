/**
 * 
 */
package tij.tweleve;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author chengj
 *
 */

class LoggingException extends Exception {
	private static Logger logger = 
			Logger.getLogger("LoggingException");
	public LoggingException () {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
/**
 * 
 * 
十一月 14, 2018 1:51:26 下午 tij.tweleve.LoggingException <init>
严重: tij.tweleve.LoggingException
	at tij.tweleve.LoggingExceptions.main(LoggingExceptions.java:33)

caught:tij.tweleve.LoggingExceptio
 * */
public class LoggingExceptions {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			// TODO: handle exception
			System.err.println("caught:" + e);
		}
		
	}

}
