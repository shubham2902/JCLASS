import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerClass {

        public static void main(String[] args) {  
            Logger loG = Logger.getLogger("FirstLog");  
            FileHandler filehndl;  
            try {    
                filehndl = new FileHandler("FirstLogFile.log");  
                loG.addHandler(filehndl);
                SimpleFormatter itformats = new SimpleFormatter();  
                filehndl.setFormatter(itformats);  
                loG.setUseParentHandlers(false);
                loG.info("lets try this log");  
            } catch (SecurityException e) {  
                e.printStackTrace();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
            loG.info("does it really work?");  
        }

	}