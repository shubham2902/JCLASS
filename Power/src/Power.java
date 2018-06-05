import java.util.Scanner;

public class Power {

    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Enter base number: ");
    	Integer a = scan.nextInt();
    	System.out.println("Enter exponent: ");
    	Integer b = scan.nextInt();
    	scan.close();
    	Integer c = b;
   

        long result = 1;

        while (b != 0)
        {
            result *= a;
            --b;
        }

        System.out.println( a + "^"+ c +" = " + result);
    }
}