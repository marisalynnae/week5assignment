package projectWeek5;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String a) {
		System.out.println("***" + a + "***");
	}

	@Override
	public void error(String b) {
		System.out.println("******************");
		System.out.println("***" + "Error: " + b + "***");
		System.out.println("******************");
	}

}
