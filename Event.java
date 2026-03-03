public class Event{

	private String eventName;
	private String eventDescription;
	private String eventLocation;
	private int noOfTickets;
	private Date eventDate;
	private Time eventTime;
	private double ticketPrice;
	private String eventID;
	private boolean plus18;

	public void setEventName(String eventName){
		this.eventName = eventName;
	}
	public void setEventDescription(String eventDescription){
		this.eventDescription = eventDescription;
	}
	public void setEventLocation(String eventLocation){
		this.eventLocation = eventLocation;
	}
	public void setNoOfTickets(int noOfTickets){
		this.noOfTickets = noOfTickets;
	}
	public void setEventDate(Date eventDate){
		this.eventDate = eventDate;
	}
	public void setEventTime(Time eventTime){
		this.eventTime = eventTime;
	}
	public void setTicketPrice(double ticketPrice){
		this.ticketPrice = ticketPrice;
	}
	public void setEventID(String eventID){
		this.eventID = eventID;
	}
	public void setParentalGuide(boolean plus18){
		this.plus18 = plus18;
	}

	public String getEventID(){

		return eventID;

	}

	public String getEventName(){
		
		return eventName;
	}

	public Date getEventDate(){
		return eventDate;

	}

	public String getHostEventSummary(){
		return String.format("Event name: %s%nEvent ID: %s%n Event Description: %s%nDate of Event: %s%nTime of Event: %s%nPrice of Ticket: %.2f%nLocation of Event: %s%nBooked Number of Ticket: %d%nAge 18+: %d%n", eventName, eventID, eventDescription, eventDate, eventTime, eventLocation, noOfTickets, plus18);

	}

	public String getAttendeeEventSummary(){

		return String.format("Event Name: %s%nEvent ID: %s%nDate of Event: %s%nTime of Event: %s%n Location: %s%nTicket Price: %.2f%nEvent Description: %s%n", eventName, eventDate, eventTime, eventLocation, ticketPrice, eventDescription);

	}

	public String eventSummaryForSearch(){
		
		return String.format("%-12s%-50s%-15s%n", eventID, eventName, eventDate);

	}

}