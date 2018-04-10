package hu.nyirszikszi.tasks;

import java.util.Scanner;

public class Task15 {
	private int bedobando,
				bedob,
				bedobott = 0;
	private int[] cimletek = {200, 100, 50, 20, 10, 5};
	
	Scanner s = new Scanner(System.in);
	
	public Task15() {
		System.out.print("Bedobandó összeg: ");
		bedobando = s.nextInt();
		
		//System.out.println("Bedobandó összeg:\t" + bedobando);
		
		do {
			System.out.print("Bedob:\t");
			bedob = s.nextInt();
			
			if (bedob(bedob) != 0) {
				bedobott += bedob;
				System.out.println("Bent van:\t" + bedobott + "\nHiányzik:\t" + (bedobando - bedobott));
			}
			else {
				System.out.println("Érvénytelen címlet!");
			}
		}
		while (bedobott < bedobando);
		
		if (bedobott > bedobando) {
			System.out.println("Visszajáró:\t" + (bedobott - bedobando));
		}
		else if (bedobott == bedobando) {
			System.out.println("Egészségedre!");
		}
	}
	
	private int bedob(int erme) {
		int r = 0;
		for (int cimlet : cimletek) {
			if (cimlet == erme) {
				r = cimlet;
			}
		}
		
		return r;
	}
}