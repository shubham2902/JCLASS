import java.util.Scanner;

public class WordCount {

	public static void main(String[] args)
	{
		System.out.println(" Enter a Sentence ");
		System.out.println();
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		//wordcount(s);
		
		System.out.println(" Number of words in the sentence are: "+ wordcount(s));
		
		scan.close();
	}
	
	public static int wordcount(String s) {
		int count = 0;
		
		/*if (!(" ".equals(s.substring(0, 1))) || !(" ".equals(s.substring(s.length() - 1))))
        {
            for (int i = 0; i < s.length(); i++)
            {
                if (s.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1; 
        }*/
		
		for(int i=0; i<s.length()-1; i++) {
			if(Character.isLetter(s.charAt(i))) {
				count++;
				for(;i<=s.length()-1;i++) {
					if(s.charAt(i)==' ') {
						count++;
						i++;
						while(s.charAt(i)==' ')
							i++;
					}
				}
			}
		} 
		
		return count;
	}
	
}
