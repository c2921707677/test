/**
 * 
 */
package tij.tweleve;

/**
 * @author chengj
 *
 */

class AException extends Exception{  
    private String a;  
    AException(){}  
    AException(String a){super(a);this.a=a;}  
    void show(){
    	System.out.println("it's another method: "+a);
    }  
}  


public class Test {
	private static int[] a=new int[2];
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;  
        while(true){  
            try{  
                a[x]=5;  
                System.out.println("trying...");  
                break;  
            }catch(ArrayIndexOutOfBoundsException e){  
                e.printStackTrace(System.out);  
                x--;  
            }finally{  
            	System.out.println("no final...");  
            }  
        }  
        System.out.println("i'm out!");
		
	}

}
