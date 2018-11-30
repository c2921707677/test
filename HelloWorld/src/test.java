public class test {
	private static int count = 0;
	private static final String NATIVE_MEDIA_ACTIVITY
    = "com.mitsubishielectric.ahu.app.media.MediaMainActivity";
	public static void test1() { 
		for (int i = 0; i < 10000; i++) {
			count ++;
			//System.out.println("count:" + count);
		}
	} 
	public static Runnable runnable = new Runnable() { 
		public void run() { 
			test1();
		} 
	}; 
	
	public void test2() {
		for(int i = 0; i < 30; i++) 
		{ 
			new Thread(runnable).start(); 
			System.out.println("i:" + i);
			
		}
	}
	public static void main(String[] args) { 
		
		test t = new test();
		t.test2();
		int count1 = Thread.activeCount();
        System.out.println("chengj currently active threads = " + count1);
		System.out.println(count);
		
	} 
}
