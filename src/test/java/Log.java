import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.xerces.dom3.DOMConfiguration;

public class Log {
    static Logger logger=Logger.getLogger(Log.class);
    public Log(){
        DOMConfigurator.configure("log4j.xml");
    }
    public void info(String message){
        logger.info(message);
    }
    public void warn(String mesaage){
        logger.warn(mesaage);
    }
    public void error(String message){
        logger.error(message);
    }
}
