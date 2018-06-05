
public class Pascal {

public static void main(String[] args) {
	
    int row = 9;

    for(int i =0;i<row;i++) {
    	
        int num = 1;
        System.out.format("%"+(row-i)*2+"s","");
       for(int j=0;j<=i;j++) {
        	
             System.out.format("%4d",num);
             num = num * (i - j) / (j + 1);

        }
        System.out.println();
    }
  }
}