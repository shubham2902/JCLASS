
public class LinearSearch {
	public static void main(String[] args)
	{
		int a=30,b=5;
		int[] c= {30,45,10,78,58,32,5};
		
		for(int i=0;i<c.length;i++)
		{        long startit = System.nanoTime ();
			if(c[i]==a) 
				System.out.println("The Element 30 is at index  "+i);
			     long stopit = System.nanoTime (); 
			     long startit1 = System.nanoTime ();
			if(c[i]==b)
				System.out.println("The Element 5 is at index  "+i);			
			        long stopit2 = System.nanoTime (); 
					long total = stopit- startit;
					long total1 = stopit2- startit1;
					System.out.println(total);
					System.out.println(total1);
		}
	}
}
