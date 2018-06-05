import java.util.Scanner;

public class RemoveDuplicateWords {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter a Sentence with duplicate words. ");		
		String input = scan.nextLine();
		scan.close();
	//String	input = " hello hello hello world ";
		
		String[] words=input.split(" ");
		for(int i=0;i<words.length;i++)			//outer
		{
			if(words[i]!=null)
			{
			
			for(int j=i+1;j<words.length;j++)	//inner
			{
				
			if(words[i].equals(words[j]))	//check if equal
				{
					words[j]=null;			
				}
			}
			}
		}
		for(int k=0;k<words.length;k++)		//display
		{
			if(words[k]!=null)
			{
				System.out.print(words[k]+" ");
			}
			
	     }  
	}

}
