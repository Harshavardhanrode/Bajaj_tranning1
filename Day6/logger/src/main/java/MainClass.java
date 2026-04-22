


import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class MainClass {
    public static void main(String[] args) throws SecurityException, IOException {
        FileHandler fileHandler = new FileHandler("mylog.txt");
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
        Logger logger = Logger.getLogger("MyLog");
        logger.addHandler(fileHandler);
        logger.info("This is a log message");

    }
}
