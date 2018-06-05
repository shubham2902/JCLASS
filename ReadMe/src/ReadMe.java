import java.io.*;
 
public class ReadMe
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("/Users/shubhamsharma/Desktop/readme.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
         
        String line;
         
        // Initializing counters
        int countWord = 0;
        int sentenceCount = 0;
        int characterCount = 0;
        int paragraphCount = 1;
        int whitespaceCount = 0;
         
        // Reading line by line from the file until a null is returned
        while((line = reader.readLine()) != null)
        {
            if(line.equals(""))
            {
                paragraphCount++;
            }
            if(!(line.equals("")))
            {
                 
                characterCount += line.length();
                 
                // \\s+ space delimiter
                String[] wordList = line.split("\\s+");
                 
                countWord += wordList.length;
                whitespaceCount += countWord -1;
                 
                // [!?.:]+ sentence delimiter
                String[] sentenceList = line.split("[!?.:]+");
                 
                sentenceCount += sentenceList.length;
            }
        }
         reader.close();
         
         System.out.println("File size in bytes is: "+file.length());
         
        System.out.println("Total word count = " + countWord);
        System.out.println("Total number of sentences = " + sentenceCount);
        System.out.println("Total number of characters = " + characterCount);
        System.out.println("Number of paragraphs = " + paragraphCount);
        System.out.println("Total number of whitespaces = " + whitespaceCount);
    }
}