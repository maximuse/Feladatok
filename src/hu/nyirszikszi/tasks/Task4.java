package hu.nyirszikszi.tasks;

import java.util.Scanner;

public class Task4 {
	Scanner s = new Scanner(System.in);
	private int r;
	
	public Task4() {
		System.out.print("Gömb sugara: ");
		r = s.nextInt();
		
		double a = 4 * Math.pow((double)r, 2) * Math.PI;
		double v = (4 * Math.pow((double)r, 3) * Math.PI) / 3;
		
		System.out.println("A(z) " + r + " sugarú gömb felszíne " + a + ", térfogata " + v + ".");
	}
}