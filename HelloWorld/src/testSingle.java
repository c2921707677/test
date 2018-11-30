

public class testSingle {
	
	private static class SingletonHolder {  
		private static final testSingle INSTANCE = new testSingle();  
	}

	private testSingle() {}
	 
    public static final testSingle getInstance() {
    	System.out.println(SingletonHolder.class);
    	return SingletonHolder.INSTANCE;  
    }  
    
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testSingle test = null;
	}

}
 