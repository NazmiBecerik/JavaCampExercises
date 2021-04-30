
public class User 
{
	private int id;
	private String courseName;
	private String firstName;
	private String lastName;	
	User(int id ,String courseName,String firstName,String lastName) 
	{
		super();
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.courseName=courseName;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
