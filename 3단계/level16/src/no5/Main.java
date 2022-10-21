package no5;

import java.util.Scanner;


// 배열 누적합 구하기
public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int arr[] = new int[6];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
			if(i!=0)
				arr[i] = arr[i]+arr[i-1];

			System.out.print(arr[i]+" ");
		}
	}

}
