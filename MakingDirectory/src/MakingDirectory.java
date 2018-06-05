import java.io.*;

public class MakingDirectory {

public static void main(String[] args) {
boolean dirFlag = false;

// create File object
File stockDir = new File("d://Stock/ stockDir ");

try {
   dirFlag = stockDir.mkdir();
} catch (SecurityException Se) {
System.out.println("Error while creating directory in Java:" + Se);
}

if (dirFlag)
   System.out.println("Directory created successfully");
else
   System.out.println("Directory was not created successfully");

 try {
	readOnlyFile();
} catch (IOException e) {

	e.printStackTrace();
}
}


private static void readOnlyFile() throws IOException
{
    File readOnlyFile = new File("c:/temp/testReadOnly.txt");
     
    //Mark it read only
    readOnlyFile.setReadOnly();
     
    if (readOnlyFile.exists())
    {
        readOnlyFile.delete();
    }
    readOnlyFile.createNewFile();
}
}