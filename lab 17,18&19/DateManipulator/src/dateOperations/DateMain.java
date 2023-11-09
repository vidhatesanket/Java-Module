package dateOperations;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;  

public class DateMain {

		public static void main(String[] args) {
			
			// System Date to String
			Scanner sc= new Scanner(System.in);
			Date dt=new Date();
			
			SimpleDateFormat str_to_dt=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
			System.out.println(str_to_dt.format(dt));
			
			
			//String to date
			System.out.println("Enter the date(dd,MM,yyyy)");
			String userDate=sc.nextLine();
			
			LocalDate ldt=LocalDate.parse(userDate,DateTimeFormatter.ofPattern("dd,MM,yyyy"));
			
			System.out.println(ldt.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			
			LocalDate date1=LocalDate.of(2023,07,23);
			LocalDate date2=LocalDate.of(2023,01,26);
			
			long days_diffrence=Math.abs(ChronoUnit.DAYS.between(date1, date2));
			System.out.println("Difference of days between the two dates: "+ days_diffrence);
		}
}
