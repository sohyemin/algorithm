import java.util.*;
public class No8 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		char arr[][] = {{'A','7','9','T','K','Q'},
						{'M','I','N','C','O','D'}};
		
		char ch1 = sc.next().charAt(0);
		char ch2 = sc.next().charAt(0);
		
		int check1=0;
		int check2=0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == ch1)
					check1=1;
				else if(arr[i][j] == ch2)
					check2=1;
			}
		}
		
		if(check1==1)
			System.out.println(ch1+" : 존재");
		else
			System.out.println(ch1+" : 없음");
		
		if(check2==1)
			System.out.println(ch2+" : 존재");
		else
			System.out.println(ch2+" : 없음");
	}

}
