package days;

import java.util.Scanner;

public class Day20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();				
		int[] a = new int[n];
		for(int i=0; i<n;i++){
			a[i] = sc.nextInt();
		}
		sc.close();
		int totswaps = 0;
		for(int i=0;i<n;i++){
			int numswaps = 0;
			for(int j=0; j<n-1;j++){
				if(a[j]>a[j+1]){
					int t=a[j];
					a[j] = a[j+1];
					a[j+1] = t;
					numswaps++;
				}
			}
			totswaps += numswaps;
			if(numswaps==0){
				break;
			}
		}
		System.out.println("Array is sorted in "+totswaps+" swaps.");
		System.out.println("First Element: "+a[0]);
		System.out.println("Last Element: "+a[n-1]);

	}

}
