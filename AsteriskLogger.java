package whateverFeelsRigthToYou;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String log) {
		// TODO Auto-generated method stub
		System.out.println("***"+log+"***");
	}

	@Override
	public void Error(String error) {
		// TODO Auto-generated method stub
		System.out.println("****************");
		System.out.println("***Error:"+error+"***");
		System.out.println("****************");
	}

	
	
}
