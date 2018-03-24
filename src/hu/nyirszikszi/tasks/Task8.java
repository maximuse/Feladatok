package hu.nyirszikszi.tasks;

import java.util.Scanner;

public class Task8 {
	private int kaloria,
				osszes;
	private double atlag;
	
	Scanner s = new Scanner(System.in);
	
	public Task8() {
		for (int i = 0; i < 7; i++) {
			System.out.print((i+1) + ". nap: ");
			kaloria = s.nextInt();
			
			osszes += kaloria;
		}
		
		atlag = osszes / 7;
		
		System.out.println("Összes kalóriafogyasztás:\t" + osszes + "\nNapi átlag:\t" + atlag);
	}
}