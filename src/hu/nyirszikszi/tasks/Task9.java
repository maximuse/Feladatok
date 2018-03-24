package hu.nyirszikszi.tasks;

import java.util.Scanner;

public class Task9 {
	Scanner s = new Scanner(System.in);
	private int n;
	
	public Task9() {
		System.out.print("Szám: ");
		n = s.nextInt();
		
		System.out.println("A(z) " + n + " " + getSum() + " db 0-t tartalmaz.");
	}
	
	private int getSum() {
		String s = Integer.toString(this.n);
		int l = String.valueOf(this.n).length();
		int r = 0;
		
		for(int i=0; i<l; i++) {
			char c = s.charAt(i);
			if (c == '0') {
				r++;
			}
		}
		
		return r;
	}
}