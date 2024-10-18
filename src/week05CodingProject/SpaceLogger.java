package week05CodingProject;

public class SpaceLogger implements Logger {

	@Override
	public void log(String input) {
		for (int i = 0; i < input.length(); i++) {
			System.out.print(input.charAt(i) + " ");
		}
	}

	@Override
	public void error(String input) {
		System.out.print("\nERROR: ");
		for (int i = 0; i < input.length(); i++) {
			System.out.print(input.charAt(i) + " ");
		}
	}

}
