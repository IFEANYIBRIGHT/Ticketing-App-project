import java.util.Scanner;
import java.util.ArrayList;
public class UserServices{

	private static Scanner input = new Scanner (System.in);
	private static ArrayList <User> userList = new ArrayList<>();
	private User loggedInUser;

	public void signUp(){
		System.out.println("Enter first name: ");
		String firstName = input.nextLine();

		System.out.println("Enter last name: ");
		String lastName = input.nextLine();

		System.out.println("Enter age: ");
		int age = input.nextInt();

		System.out.println("Enter email address: ");
		String email = input.nextLine();

		System.out.println("Enter password: ");
		String password = input.nextLine();

		User user = new User();

		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setAge(age);
		user.setEmailAddress(email);
		user.setPassword(password);

		userList.add(user);

	}

	public boolean login(){

		System.out.println("Enter email address: ");
		String email = input.nextLine();

		System.out.println("Enter password: ");
		String password = input.nextLine();

		for (User user : userList){
			if (user.getEmailAddress().equalsIgnoreCase(email) && user.getPassword().equals(password)){
				loggedInUser = user;
				break;		
			}
		}

		if (loggedInUser == null){
			System.out.println("Invalid email or password");
			return false;
		}
		else{
			System.out.printf("Welcome %s%n", loggedInUser.getFirstName());
			return true;
		}
	}



}