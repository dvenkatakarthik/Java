package arrayspack;

import java.util.Scanner;

public class SparseArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		int i=0;
		
		while(n-- > 0){
			String temp = sc.next();
			arr[i] = temp;
			i++;
			
		}
		int q=sc.nextInt();		
		while(q-- > 0){
			String temp = sc.next();
			find(arr,temp);
		}

	}
	public static void find(String[] arr,String s){
		int count=0;
		for(int z=0; z<arr.length;z++){
			if(arr[z].equals(s)){
				count = count+1 ;
			}			
		}
		System.out.println(count);
	}
}
