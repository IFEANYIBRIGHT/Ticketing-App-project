import java.util.Scanner;
import java.util.ArrayList;
public class EventServices{

	private static Scanner input = new Scanner (System.in);

	private static ArrayList <Event> eventList = new ArrayList<>();

	public void getEventDetails(){
		System.out.println("Enter event name: ");
		String eventName = input.nextLine();

		System.out.println("Enter event description: ");
		String eventDescription = input.nextLine();

		System.out.println("Enter event location: ");
		String eventLocation = input.nextLine();

		System.out.println("Enter no of tickets: ");
		int noOfTickets = input.nextInt();

		System.out.println("For event date(XX:YY:ZZZZ):%nEnter day of the month: ");
		int day = input.nextInt();
		System.out.println("Month: ");
		int month = input.nextInt();
		System.out.println("Year: ");
		int year = input.nextInt();

		System.out.println("For event time (HH:MM)%nEnter Hour: ");
		int hour = input.nextInt();
		System.out.println("Enter Minute: ");
		int minute = input.nextInt();

		System.out.println("Enter event price: ");
		double price = input.nextDouble();

		System.out.print("""
			Is the event 18+
			1. Yes
			2. No
	
		""");
		String response = input.nextLine().trim();

		boolean plus18 = false;

		if (response.equals("1")){
			plus18 = true;
		}

		String eventID = ID.generateEventID();

		Event event = new Event();
		Date date = new Date(day, month, year);
		Time time = new Time(hour, minute);

		event.setEventName(eventName);
		event.setEventDescription(eventDescription);
		event.setEventLocation(eventLocation);
		event.setNoOfTickets(noOfTickets);
		event.setEventTime(time);
		event.setEventDate(date);
		event.setTicketPrice(price);
		event.setEventID(eventID);
		event.setParentalGuide(plus18);
		
		eventList.add(event);

		event.getHostEventSummary();		


	}

	public void listOfEvents(){

		for (Event event : eventList){
			event.eventSummaryForSearch();
		}

	}

	public void searchEvent(String partOfEventName){
		
		for (Event event : eventList){
			if (event.getEventName().contains(partOfEventName)){
				event.eventSummaryForSearch();
			}
		}

		System.out.println("No search found");

	}

	public void attendeeEventSummary(String ID){
		for (Event event : eventList){

			if (event.getEventID().equals(ID.trim())){
				event.getAttendeeEventSummary();
				break;
			}
		}

	}


}