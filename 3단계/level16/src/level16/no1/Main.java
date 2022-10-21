package level16.no1;

import java.util.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// 세 문장 2차 배열 생성
		// 문장의 마지막 인덱스를 저장하는 배열 생성
		char arr[][] = new char[3][10];
		int last[] = new int[3];
		
		
		for (int i = 0; i < arr.length; i++) {
			// 문자열과 문자열의 길이를 저장한다
			String str = sc.nextLine();
			last[i] = str.length()-1;
			
			//문자를 저장
			for (int j = 0; j < str.length(); j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		
		// 저장한 문자열의 길이를 이용하여 문자열 마지막 문자를 출력한다
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][last[i]]);
		}
		
	}

}
