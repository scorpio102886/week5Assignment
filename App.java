package whateverFeelsRigthToYou;


public class App {

	public static void main(String[] args) {
		Logger logger = new AsteriskLogger();
		logger.Log("Mission Critical");
		System.out.println();
		logger.Error("Explosion Iminent!!!");

		Logger spacedLogger = new SpacedLogger();
		spacedLogger.Log("test");
		System.out.println();
		spacedLogger.Error("testing");
	
	
	
	
	}

}
