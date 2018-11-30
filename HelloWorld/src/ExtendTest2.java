import java.util.Arrays;

/**
 * 
 */

/**
 * @author chengj
 *
 */

abstract class Bases {
	public Bases(int i) {
		System.out.println("base constructor:and i =" + i);
	}
	public abstract void f();
}

public class ExtendTest2{

	private int a = 1;
	private int b;
	
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("ExtendTest2");
		ExtendTest1 t1 = new ExtendTest1() ;
		t1.test();
	}
	
	public interface Contents {
		int value();
	}
	
	public Contents contents() {
		return new Contents() {
			private int i = 11;
			public int value() {
				return i;
			}
		};
	}
	
	public static Bases getBase(int i) {
		return new Bases(i) {
			{System.out.println("inside init base");}
			public void f() {
				System.out.println("inside f()");
			}
		};
	}
	
	public static String getHello() { 
        return "hello"; 
    } 
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendTest2 extendTest2 = new ExtendTest2();
//		extendTest2.test();
//		System.out.println(extendTest2.a);
//		System.out.println(extendTest2.b);
//		Contents c = extendTest2.contents();
//		System.out.println(c.value());

//		Bases base = getBase(123);
//		
//		String a = "hello2";   
//        final String b = getHello(); 
//        String c = b + 2;   
//        System.out.println((a == c)); 
//        System.out.println(a.equals(c));
//        Thread t1 = new Thread();
//        
		byte[] bufferRead = {(byte) 0xFF, 0x55, 0x02, 0x00, (byte) 0xEE, 0x10};
		System.out.println(Arrays.toString(bufferRead));
		System.out.println(bufferRead.length);
		
	}

}
