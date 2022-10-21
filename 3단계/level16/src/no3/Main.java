package no3;

import java.util.*;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		char arr[] = new char[6];
		
		String str = sc.next();
		
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		int A = sc.nextInt(); 
		
		for (int next = (arr.length - 1); next > A; next--) {
			arr[next] = arr[next-1];
		}
		
		arr[A] = 'A';
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!='\0')
				System.out.print(arr[i]);
		}
	}
}