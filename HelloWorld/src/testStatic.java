
public class testStatic extends Base {

	static{
        System.out.println("test static");
    }
     
    public testStatic(){
        System.out.println("test constructor");
    }
    static int a = 1;
    public void test() {
    	//static int a = 1;
    }
    
    public int add() {
    	return 0;
    };
	
//	li

}
class Base{
    static{
        System.out.println("base static");
    }
     
    public Base(){
        System.out.println("base constructor");
    }
}