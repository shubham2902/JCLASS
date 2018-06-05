import java.util.*;


 public class CapitalFirst {
	 
     public static void main(String[] args){
    	 
    	Scanner scan = new Scanner(System.in);
    	 
    	 System.out.println("Enter a Sentence: ");
    	 
    	 String s = scan.nextLine();
    	 String changeCase = ""; 
    	 
    	   Scanner scan2 = new Scanner(s); 
    	     while(scan2.hasNext()) {
    	         String word = scan2.next(); 
    	         changeCase += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
    	     }
    	     
    	  System.out.println(changeCase.trim()); 
    	  
    	  scan.close();
    	  scan2.close();
    	 
//    	 int[] a = {56,21,34,16,45,72};
//    			 
//    			 for(int i=0;i< a.length; i++) {
//    				 for(int j =i+1;j<a.length;j++) {
//    					 int temp = a[i];
//    					 a[i] = a[j];
//    					 a[j] = temp;
//    					 
//    				 }
//    			 }
//    			 
//    			 for(int x=0;x<a.length;x++)
//    				System.out.println(a);
    }
	 
}
	