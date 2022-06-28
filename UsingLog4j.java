import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class UsingLog4j {

	static Logger log = Logger.getLogger(UsingLog4j.class);

	public static void main(String[] args) {

		BasicConfigurator.configure();
		
		log.info("Veera");
		log.debug("Mani");
		log.fatal("Ragavan");
		log.error("Balu");
		log.warn("Mathu");
		
	}
}
