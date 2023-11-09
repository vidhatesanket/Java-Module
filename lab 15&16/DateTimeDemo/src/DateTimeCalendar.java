import java.util.Calendar;
import java.util.Date;

public class DateTimeCalendar {
		    public static void main(String[] args) {
		        
		        Date currentDate = new Date();
		        System.out.println("Current date: " + currentDate);

		        // Create a Calendar object for the current date and time
		        Calendar calendar = Calendar.getInstance();
		        System.out.println("Current date and time using Calendar: " + calendar.getTime());

		        // Set the date and time components of the Calendar object
		        calendar.set(Calendar.YEAR, 2021);
		        calendar.set(Calendar.MONTH, Calendar.JANUARY);
		        calendar.set(Calendar.DAY_OF_MONTH, 1);
		        calendar.set(Calendar.HOUR_OF_DAY, 0);
		        calendar.set(Calendar.MINUTE, 0);
		        calendar.set(Calendar.SECOND, 0);
		        calendar.set(Calendar.MILLISECOND, 0);

		        // Retrieve the Date object from the Calendar object
		        Date newDate = calendar.getTime();
		        System.out.println("New date: " + newDate);

		        // Get the time components of the Date object
		        long millis = newDate.getTime();
		        int hours = (int) (millis / (1000 * 60 * 60));
		        int minutes = (int) ((millis / (1000 * 60)) % 60);
		        int seconds = (int) ((millis / 1000) % 60);
		        System.out.println("New time: " + hours + ":" + minutes + ":" + seconds);
		    }
		
}
