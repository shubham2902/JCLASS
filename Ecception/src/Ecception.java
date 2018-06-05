import java.util.Scanner;

public class Ecception {

	public static void main(String[] args) {
		
		int a,b,c =1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to be divided");
		a= scanner.nextInt();
		System.out.println("Enter the divisior");
		b= scanner.nextInt();
		
		try {
			
			c = a/b;
			
			
		} catch (Exception DividebyZero) {
			System.out.println("Please don't divide by 0.");
		}
		
		scanner.close();
		if(b!=0)
		System.out.println(a+"/"+b+" = "+c);
	}
		
	}


