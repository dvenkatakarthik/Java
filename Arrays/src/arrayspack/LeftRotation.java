package arrayspack;

import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 2*n, n1=n;
		int r = sc.nextInt();
		int[] arr = new int[m];
		int i = 0;
		while(n1-- > 0){
			int temp = sc.nextInt();
			arr[i] = temp;
			arr[i+n] = temp;
			i++;
		}
		for(int j=r; j<r+n; j++){
			System.out.print(arr[j]+" ");
		}
	}

}
