package whateverFeelsRigthToYou;
public class SpacedLogger implements Logger{

	@Override
	public void Log(String log) {
		// TODO Auto-generated method stub
		//System.out.println(Log.replace("", " ").trim());
		
		for(int i=0;i<log.length();i++) {
			System.out.print(log.charAt(i)+" ");
		}
	}

	@Override
	public void Error(String error) {
		// TODO Auto-generated method stub
		for(int i=0;i<error.length();i++) {
			System.out.print(error.charAt(i)+" ");
		}
	}

	
//	public void Log(String Log) {
//		
//	}
//	public void Error(String Error) {
//		System.out.println("ERROR: "+Error.replace("", " ").trim());
//	}
}
