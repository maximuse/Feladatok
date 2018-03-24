package hu.nyirszikszi.tasks;

import java.util.Scanner;

public class Task7 {
	Scanner s = new Scanner(System.in);
	private int n;
	
	public Task7 () {
		System.out.print("Óra: ");
		n = s.nextInt();
		
		if (n < 0 || n > 24) {
			System.out.println("Nincs ilyen óra!");
		}
		else {
			if (n <= 9 && n >= 4) {
				System.out.println("Jó reggelt!");
			}
			else if (n <= 17 && n >= 10) {
				System.out.println("Jó napot!");
			}
			else if (n <= 21 && n >= 18) {
				System.out.println("Jó estét!");
			}
			else {
				System.out.println("Jó éjszakát!");
			}
		}
	}
}