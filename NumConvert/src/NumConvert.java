import java.util.Scanner;
 
public class NumConvert {
 
	public static void main(String[] args) {
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type a number(max upto 10 digits)");
		try {
			
			number = scanner.nextInt();
			if (number == 0) {
				System.out.print("Number in words: Zero");
			} else {
				System.out.print("Number in words: " + numToWord(number));
			}
		} catch (Exception e) {
			System.out.println("Please enter a valid number");
		}
		
		scanner.close();
	}
 
	private static String numToWord(int num) {
               
                String words = "";
		String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", 
                                "seven", "eight", "nine", "ten", "eleven", "twelve",
                                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
                                "eighteen", "nineteen" };
		String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
                                 "sixty", "seventy", "eighty", "ninety" };
 
		if (num == 0) {
			return "zero";
		}
		// adding minus if num<0
		if (num < 0) { 
                        String numberStr = "" + num;
                        numberStr = numberStr.substring(1);
                        return "minus " + numToWord(Integer.parseInt(numberStr));
                } 
		
		// Divisibility by 1 billion
		if ((num / 1000000000) > 0) {
			words += numToWord(num / 1000000000) + " billion ";
			num %= 1000000000;
		}
                // Divisibility by 1 million
                if ((num / 1000000) > 0) {
			words += numToWord(num / 1000000) + " million ";
			num %= 1000000;
		}
		// Divisibility by 1 thousand
		if ((num / 1000) > 0) {
			words += numToWord(num / 1000) + " thousand ";
			num %= 1000;
		}
		// Divisibility by 1 hundred
		if ((num / 100) > 0) {
			words += numToWord(num / 100) + " hundred ";
			num %= 100;
		}
 
		if (num > 0) {
			// check for tens
			if (num < 20) {
                                 words += unitsArray[num];
                        } else { 
                                // value from tens array
                                words += tensArray[num / 10]; 
                                if ((num % 10) > 0) {
				   words += "-" + unitsArray[num % 10];
                            }  
			}
		}
 
		return words;
	}
 
}
