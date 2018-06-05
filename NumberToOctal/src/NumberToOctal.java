import java.util.Scanner;

public class NumberToOctal {

	public static void main(String[] args) {
		
	
		Scanner number = new Scanner(System.in);
		System.out.println("Enter a number: ");
		Integer i ;
				i = number.nextInt();
		number.close();
		
        String octal = Long.toOctalString(i);
        
        
        System.out.println("Octal value: "+octal);

	}

}
