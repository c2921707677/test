/**
 * 2018年11月23日
 */
package tij.fourteen;

import java.util.ArrayList;

/**
 * @author chengj
 */
public class Staff extends ArrayList<Position> {

	public void add(String title, Person person) {
		add(new Position(title, person));
	}
	
	public void add(String... strings) {
		for (String string : strings) {
			add(new Position(string));
		}
	}
	
	public Staff(String...strings) {
		add(strings);
	}
	
	public boolean positionAvailable(String title) {
		for (Position position : this) {
			if (position.getTitle().equals(title) &&
					position.getPerson() == Person.NULL) {
				return true;
			}
		}
		return false;
	}
	
	public void fillPosition(String title, Person hire) {
		for (Position position : this) {
			if (position.getTitle().equals(title) &&
					position.getPerson() == Person.NULL) {
				position.setPerson(hire);
				return ;
			}
		}
		throw new RuntimeException("Position " + title + " not available");
	}
	
	/**
	 * @param argsvoid
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff staff = new Staff("P1", "P2", "P3", "P4", "P5", "P6", "P7");
		staff.fillPosition("P1", new Person("Me", "Last", "The top, Lonely At"));
		staff.fillPosition("P3", new Person("jannet", "Planner", "The Burbs"));
		if (staff.positionAvailable("P2")) {
			staff.fillPosition("P2", new Person("Bob", "Coder", "Bright Light City"));
		}
		System.out.println(staff);
	}

}
