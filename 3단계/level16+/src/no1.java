
import java.util.Scanner;

public class no1 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		int repeat = sc.nextInt();
		
		for (int i = 0; i < repeat; i++) {
			for (int j = start; j <= end; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
