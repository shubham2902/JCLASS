
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class NoOfDays {

	public static void main(String[] args) {
		
		LocalDate  d1 = LocalDate.of(2017, 03, 01); 
	    LocalDate  d2 = LocalDate.of(2017, 05, 15);
	    
	    System.out.println(d1.until(d2,DAYS));
	  
	}

}

