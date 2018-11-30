package tij.fourteen;

/**
 * @author chengj
 *
 */
public class Person {
	public final String first;
	public final String last;
	public final String address;
	/**
	 * @param first
	 * @param last
	 * @param address
	 */
	public Person(String first, String last, String address) {
		super();
		this.first = first;
		this.last = last;
		this.address = address;
	}
	
	public String toString() {
		return "Person: " + first + " " + last + " " + address;
	}
	
	public static class NullPerson extends Person implements Null {

		/**
		 * @param first
		 * @param last
		 * @param address
		 */
		private NullPerson() {
			super("None", "None", "None");
		}
		public String toString() {
			return "NullPerson";
		}
	}
	
	public static final Person NULL = new NullPerson();
	
}
