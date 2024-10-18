package week05CodingProject;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String input) {
		System.out.println("***" + input + "***");
	}

	@Override
	public void error(String input) {
		for (int i = 0; i < input.length()+13; i++) {
			System.out.print('*');
		}
		System.out.println("\n***Error: " + input + "***");
		for (int i = 0; i < input.length()+13; i++) {
			System.out.print('*');
		}
		System.out.println("");
	}

}
