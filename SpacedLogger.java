package projectWeek5;

public class SpacedLogger implements Logger{

	@Override
	public void log(String a) {
		String result = "";
		for (int i = 0; i < a.length(); i++) {
			result += a.charAt(i);
			result += " ";
		}
		System.out.println(result);
	}

	@Override
	public void error(String b) {
		String result = "";
		for (int i = 0; i < b.length(); i++) {
			result += b.charAt(i);
			result += " ";
		}
		System.out.println("ERROR: " + result);
	}

}
