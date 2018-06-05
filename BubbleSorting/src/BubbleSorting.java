import java.util.Scanner;


public class BubbleSorting {
	
	static void bubbleSort(int[] arr) {  
	    int n = arr.length;  
	    int temp = 0;  
	     for(int i=0; i < n; i++){  
	             for(int j=1; j < (n-i); j++){  
	                      if(arr[j-1] > arr[j]){  
	                             
	                             temp = arr[j-1];  
	                             arr[j-1] = arr[j];  
	                             arr[j] = temp;  
	                     }  
	                      
	             }  
	     }  

	}  
	
	    public static void main(String[] args) {  
	               // int arr[] ={3,60,35,2,45,320,5};  
	    	Scanner input = new Scanner(System.in);

	        
	        System.out.println("How many numbers do you want to enter?");
	        int num = input.nextInt();
	        

	        int array[] = new int[num];

	        System.out.println("Enter " + num + " numbers now.");

	        for (int i = 0 ; i < array.length; i++ ) {
	           array[i] = input.nextInt();
	        }
	        input.close();
	                 
	                System.out.println("Array Before Bubble Sort");  
	                for(int i=0; i < array.length; i++){  
	                        System.out.print(array[i] + " ");  
	                }  
	                System.out.println();  
	                  
	                bubbleSort(array);//sorting 
	                 
	                System.out.println("Array After Bubble Sort");  
	                for(int i=0; i < array.length; i++){  
	                        System.out.print(array[i] + " ");  
	                }  
	   
	        }  
	}  



