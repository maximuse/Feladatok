package hu.nyirszikszi.tasks;

import java.util.Scanner;

public class Task10 {
	private int a,
				b;
	private double terulet;
	
	Scanner s = new Scanner(System.in);
	
	public Task10() {
		System.out.print("A: ");
		a = s.nextInt();
		
		System.out.print("B: ");
		b = s.nextInt();
		
		terulet = ( a * b ) / 3.6;
		
		System.out.println("Terület: " + terulet);
		
		if (terulet < 100) {
			System.out.println("A terület túl kicsi!");
		}
	}
}