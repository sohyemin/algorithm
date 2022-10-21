import java.util.*;


public class No6 {

	static void FindMax(char arr[]) {
		int max=0;
		char maxCh = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			char ch = arr[i];	
			if(maxCh<=ch)
			{
				maxCh = ch;
				max = i;
			}
		}		
		
		System.out.println(max);
	}

	static void FindMin(char arr[]) {
		int min=0;
		char minCh = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			char ch = arr[i];	
			if(minCh>ch)
			{
				minCh = ch;
				min = i;
			}
		}		
		
		System.out.println(min);
	}

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		char arr[] = sc.next().toCharArray();
		
		FindMax(arr);
		FindMin(arr);
	}
}
