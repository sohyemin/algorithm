import java.util.*;
public class No3 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
				
		int maxX,maxY,minX,minY;
		maxX=maxY=minX=minY=0;

		int arr[][] = new int[2][3];

		int max=0;
		int min=0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				int Z = sc.nextInt();

				if(i==0 && j ==0) 
				{
					max=min=arr[i][j]=Z;
				}
				
				
				if(Z>max) 
				{
					max=Z;
					maxX=j;
					maxY=i;
				}
				
				else if(Z<min)
				{
					min=Z;
					minX=j;
					minY=i;
				}
				
			}
		}
		
		System.out.printf("(%d,%d)\n",maxY,maxX);
		System.out.printf("(%d,%d)",minY,minX);
		
	}
}