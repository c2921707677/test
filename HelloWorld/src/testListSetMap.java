import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/**
 * 
 */

/**
 * @author chengj
 *
 */
public class testListSetMap {

	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set<String> mSet = new HashSet<String>();
//		mSet.add("123");
//		mSet.add("123");
//		mSet.add("456");
//		Iterator<String> it = mSet.iterator();
//		while (it.hasNext()) {
//			String temp = it.next();
//			System.out.println(temp);
//		}
		LinkedList<String > linkedList = new LinkedList<String>();
		linkedList.add("123");
		linkedList.add("123");
		linkedList.add("456");
		linkedList.add("789");
		Iterator<String> linkIT = linkedList.iterator();
//		while (linkIT.hasNext()) {
//			String temp = linkIT.next();
//			System.out.println(temp);
//		}
		linkedList.remove("456");
		for (int i = 0; i < linkedList.size(); i++) {
			if (linkedList.get(i) == null) {
				System.out.println("NULL");
			} else
				System.out.println(linkedList.get(i));
			//System.out.println(linkedList.get(i));
		}
		while (linkIT.hasNext()) {
			String temp = linkIT.next();
			if (temp == null) {
				System.out.println("NULL");
			} else
				System.out.println(temp);
		}
	}

}
