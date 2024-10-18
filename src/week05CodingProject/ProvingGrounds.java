package week05CodingProject;

public class ProvingGrounds {

	public static void main(String[] args) {
		
		AsteriskLogger asteriskLogger = new AsteriskLogger();
		
		asteriskLogger.log("This is working.");
		
		asteriskLogger.error("This is not working.");
		
		SpaceLogger spaceLogger = new SpaceLogger();
		
		spaceLogger.log("This is a useful method.");
		
		spaceLogger.error("This is such a useful method.");
	}

}
