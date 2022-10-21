import java.util.*;
public class No9 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int y = sc.nextInt();
		int x = sc.nextInt();
		
		char ch = sc.next().charAt(0);
		
		for (int i = 0; i < 2; i++) {
			for (int row = 0; row < y; row++) {
				for (int col = 0; col < x; col++) {
					System.out.print(ch);
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
