public class User{

	private String firstName;
	private String lastName;
	private String emailAddress;
	private String password;
	private int age;

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public void setEmailAddress(String emailAddress){
		this.emailAddress = emailAddress;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public void setAge(int age){
		this.age = age;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getLastName(){
		return lastName;
	}

	public String getEmailAddress(){
		return emailAddress;
	}
	public int getAge(){
		return age;
	}
	public String getPassword(){
		return password;

	}

	

}