/**
 * 
 */

/**
 * @author chengj
 *
 */
public class testStateMachine {
	
	public enum TestEnum {
		IDLE, INUSE, RELEASE
	}
	
	public static void main(String[] args) {
		for (String string : args) {
			System.out.println(string + ", ");
		}
		System.out.println(testStateMachine.class.getSimpleName());
		for (TestEnum string : TestEnum.values()) {
			System.out.println(string + ", ordinal " + string.ordinal());
		}
		
	}
}

