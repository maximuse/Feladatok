package hu.nyirszikszi.tasks;

import java.util.Scanner;

public class Task13 {
	private int n;
	
	Scanner s = new Scanner(System.in);
	
	public Task13() {
		System.out.print("Meddig: ");
		n = s.nextInt();
		
		for (int i = 2; i <= n; i++) {
			boolean prim = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0 ) {
					prim = false;
				}
			}
			if (prim) {
				System.out.print(i + " ");
			}
		}
	}
}