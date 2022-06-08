package streamAPI;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		 LocalDate currDate = LocalDate.now();
		 DayOfWeek dayOfweek = currDate.getDayOfWeek();
		 
		 int dayOfMonth = currDate.getDayOfMonth();
		 int dayOfYear = currDate.getDayOfYear();
		 
		 System.out.println("Date: " + currDate);
		 System.out.println("Day of Week:" + dayOfweek);
		 System.out.println("Day of Month: " + dayOfMonth);
		 System.out.println("Day of Year:" +dayOfYear);
		 
	}

}
