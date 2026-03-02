public class Date{

	private int day;
	private int month;
	private int year;

	private static final int [] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public Date(int day, int month, int year){

		if (month < 1 || month > 12){
			throw new IllegalArgumentException ("Month" + month + "must be between 1 - 12");

		}

		if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))){
		throw new IllegalArgumentException("invalid day inputed");

		} 

		if (day == 29 && month == 2 && !(year % 4 == 0)){
			throw new IllegalArgumentException("Invalid input");

		}

		this.day = day;
		this.month = month;
		this.year = year;


	}

	public String toString(){
		return String.format("%d/%d/%d", month, day, year);

	}

}