import java.security.SecureRandom;

public class ID{

	private static SecureRandom random = new SecureRandom();

	public static String generateEventID(){

		String IDNumber = "";

		for (int counter = 1; counter <= 3; counter++){

			char letter = (char) ('A' + random.nextInt(26));

			IDNumber += letter;
		}

		for (int counter = 1; counter <= 5; counter++){
			int number = random.nextInt(10);
			IDNumber += String.valueOf(number);

		}

		return IDNumber;

	}

	public static String generateAttendeeID(){

		String IDNumber = "";

		for (int counter = 1; counter <= 4; counter++){

			char letter = (char) ('a' + random.nextInt(26));

			IDNumber += letter;
		}

		for (int counter = 1; counter <= 4; counter++){
			int number = random.nextInt(10);
			IDNumber += String.valueOf(number);

		}

		return IDNumber;

	}

	

}