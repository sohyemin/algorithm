package no6;

import java.util.*;


// M이 존재합니까?
public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int check = 0;

		for (int i = 0; i < 3; i++) {
			if(sc.next().contains("M"))
				check=1;
		}
		
		if(check==1) System.out.println("M이 존재합니다");
		else System.out.println("M이 존재하지 않습니다");
	}

}
