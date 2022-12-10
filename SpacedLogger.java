package week5;

public class SpacedLogger implements Logger{

	@Override
	public void Log(String word) {
		int wl = word.length();
		for(int i = 0; i < wl; i++)
		{
			System.out.print(word.charAt(i) + " ");
		}
		System.out.println();
	}

	@Override
	public void Error(String word) {
		int wl = word.length();
		System.out.print("Error: ");
		for(int i = 0; i < wl; i++)
		{
			System.out.print(word.charAt(i) + " ");
		}
		System.out.println();
	}

}
