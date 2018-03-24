package hu.nyirszikszi.tasks;

import java.util.Scanner;

public class Task17 {
	private int a,
				b,
				c;
	private double d, x1, x2;
	
	Scanner s = new Scanner(System.in);
	
	public Task17() {
		System.out.print("A: ");
		a = s.nextInt();
		
		System.out.print("B: ");
		b = s.nextInt();
		
		System.out.print("C: ");
		c = s.nextInt();
		
		//d = b * b - 4 * a * c;
		d = Math.pow(b, 2) - 4 * a * c;
		
		x1 = (-1 * b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
		x2 = (-1 * b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
		
		System.out.println("X1 = " + x1);
		System.out.println("X2 = " + x2);
	}
}