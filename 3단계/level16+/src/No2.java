import java.util.*;

public class No2 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		char arr[][] = new char[6][3];
		char input = 'A';
		
		for (int i = 2; i >= 0; i--) {
			for (int j = 5; j >= 0; j--) {
				arr[j][i]=input;
				input++;
			}
		}
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println(arr[x][y]);
		
	}
}
