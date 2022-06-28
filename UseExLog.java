import org.apache.log4j.BasicConfigurator;

public class UseExLog {

	public static void main(String [] args ) {
		ExLog a= new ExLog ();
		BasicConfigurator.configure();
		a.findAddition();
	}
}
