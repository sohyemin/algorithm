import java.util.*;

public class No7 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int input = 1;

		int arr[][] = new int[7][4];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=input++;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			int Z = sc.nextInt();
			for (int j = 0; j < arr[i].length; j++) {
				arr[Z][j]=0;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
