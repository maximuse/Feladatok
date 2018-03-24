package hu.nyirszikszi.tasks;

import java.util.Scanner;

public class Task6 {
	private int a;
	private int b;
	
	Scanner s = new Scanner(System.in);
	
	public Task6() {
		System.out.print("Főnök fizetése: ");
		a = s.nextInt();
		
		System.out.print("Saját fizetése: ");
		b = s.nextInt();
		
		if (a > b) {
			System.out.println("A főnöke fizetése nagyobb.");
		}
		else if (a < b) {
			System.out.println("A saját fizetése nagyobb.");
		}
		else {
			System.out.println("A két fizetés egyenlő.");
		}
	}
}