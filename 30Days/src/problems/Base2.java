package problems;

import java.util.Scanner;

public class Base2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0,maxcount=0;
		while(n>0){
			int x = n%2;
			//System.out.println(x);
			if(x==1){
				count++;
				if (maxcount < count)
					maxcount = count;
			}
			else{
				if (maxcount < count)
					maxcount = count;
				count = 0;
			}
			n=n/2;
			//System.out.println(n);
		}
		System.out.println(maxcount);
	}

}
