import java.util.*;
public class No4 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int arr[] = new int[6];
		
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		
		for (int i = 2; i < arr.length; i++) {
			arr[i]=arr[i-2]*arr[i-1];
		}

		System.out.println(arr[5]);
	}

}
