package hu.nyirszikszi.tasks;

import java.util.Scanner;

public class Task11 {
	private int evszam;
	
	Scanner s = new Scanner(System.in);
	
	public Task11() {
		System.out.print("Évszám: ");
		evszam = s.nextInt();
		
		if (evszam < 0) {
			System.out.println("Hiba! Az évszám nem lehet negatív!");
		}
		else if (evszam % 17 == 0) {
			System.out.println("A(z) " + evszam + " osztható 17-el.");
		}
		else {
			System.out.println("A(z) " + evszam + " nem osztható 17-el.");
		}
	}
}