import java.time.ZoneId;
import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;

public class DateDiff {
	public static void main(String args[]) {
		
		//Instant c = c.from(2018,03,02,8,0,0,0);
	    
		ZonedDateTime india=ZonedDateTime.of(2018, 03,02,8,0,0,0,ZoneId.of("Asia/Calcutta"));
		
		//ZonedDateTime a = ZonedDateTime.ofInstant(instant, ZoneId.of("Asia/Calcutta"))
		
		ZonedDateTime chicago=ZonedDateTime.of(2018, 05,02,8,0,0,0,ZoneId.of("America/Chicago"));
		Duration x=Duration.between(india, chicago);
		System.out.println(india);
		System.out.println(chicago);
	    System.out.println(x.toHours() + " Hours or "+x.toDays()+" Days.");
	  }
	}

