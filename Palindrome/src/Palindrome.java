import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println(" Enter a word ");
		System.out.println();
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char[] arr = s.toCharArray();
		
		if(isPalindrome(arr) == true)
		System.out.println("The word " + s + " is a palindrome.");
		else
			System.out.println("The word " + s + " is not a palindrome.");
		scan.close();
		
	}

	public static boolean isPalindrome(char[] word){
	    int i = 0;
	    int j = word.length - 1;
	    while (j > i) {
	        if (word[i] != word[j]) {
	            return false;
	        }
	        ++i;
	        --j;
	    }
	    return true;
	}
}
