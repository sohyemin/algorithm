package no4;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String str = sc.next();
		
		int index = sc.nextInt();
		
		System.out.print(str.substring(0, index)+str.substring(index+1));
	}

}
