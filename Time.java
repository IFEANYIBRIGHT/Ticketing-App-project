public class Time{

	private int hours;
	private int minutes;

	public Time(int hours, int minutes){

		if (hours < 0 || hours >= 24){
			throw new IllegalArgumentException("Hours should be between 1 and 23");
		}

		if (minutes < 0 || minutes >= 60){
			throw new IllegalArgumentException("Minutes should be between 1 - 59");
		}

		this.hours = hours;
		this.minutes = minutes;

	}

	public String toString(){
		return String.format("%02d:%02d", hours, minutes);
	}

}