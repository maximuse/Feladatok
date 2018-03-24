package hu.nyirszikszi.tasks;

import java.util.Scanner;

public class Task18 {
	private int n;
	
	Scanner s = new Scanner(System.in);
	
	public Task18() {
		System.out.print("Meddig: ");
		n = s.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int osszeg = 0;
			for (int j = 1; j <= i/2; j++) {
				if (i % j == 0) {
					osszeg += j;
				}
			}
			
			if (osszeg == i) {
				System.out.print(i + " ");
			}
		}
	}
}