package week5;

import java.util.Scanner;

public class App {
	public  static int a = 1;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("We are going to test our logger");
		app();
		


	}
	
	public static void app()
	{
		Logger logAstrick = new AsterickLogger();
		Logger logSpaced = new SpacedLogger();
		String word;
		switch(a)
		{
		case 1:
			System.out.println("Please enter the String you would like to test With Astrick Log: ");
			word = scan.next();
			logAstrick.Log(word);
			a++;
			app();
			break;
		case 2:
			System.out.println("Please enter the String you would like to test With Astrick Error: ");
			word = scan.next();
			logAstrick.Error(word);
			a++;
			app();
			break;
		case 3:
			System.out.println("Please enter the String you would like to test With Spaced Logged: ");
			word = scan.next();
			logSpaced.Log(word);
			a++;
			app();
			break;
		case 4:
			System.out.println("Please enter the String you would like to test With Spaced Logged: ");
			word = scan.next();
			logSpaced.Error(word);
			a++;
			app();
			break;
			default:
				System.out.println("Program Ended");
				break;

		}
		
		
	}

}
