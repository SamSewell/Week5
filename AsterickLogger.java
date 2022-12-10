package week5;

import java.util.ArrayList;
import java.util.Scanner;

public class AsterickLogger implements Logger{

	@Override
	public void Log(String word) {
		
		System.out.println("***" + word + "***");
		
		
	}

	@Override
	public void Error(String word) {
		int wordLength = word.length();
		wordLength += 11;
		ArrayList<String> wl = new ArrayList<String>();
			for(int i = 0; i <= wordLength; i++)
		{
			wl.add("*");
		}
			for(int i = 0; i < wl.size(); i++)
		{
			System.out.print(wl.get(i));
			
		}
			System.out.println();
			System.out.println("***Error:" + word + "***");
		for(int i = 0; i < wl.size(); i++)
		{
			System.out.print(wl.get(i));
			
		}
		System.out.println();
	}

}
