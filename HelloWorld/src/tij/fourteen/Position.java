/**
 * 2018年11月23日
 */
package tij.fourteen;

/**
 * @author chengj
 */
public class Position {
	private String title;
	private Person person;
	/**
	 * @param title
	 * @param person
	 */
	public Position(String title) {
		this.title = title;
		this.person = Person.NULL;
	}
	/**
	 * @param title2
	 * @param person2
	 */
	public Position(String title2, Person person2) {
		this.title = title2;
		this.person = person2;
		if (this.person == null) {
			this.person = Person.NULL;
		}
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}
	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Position [title=" + title + ", person=" + person + "]";
	}
	
	
	
}
