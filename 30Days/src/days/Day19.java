package days;

import java.util.Scanner;

interface Ad{
	int divisorSum(int n);
}
class Calculator implements Ad{
	public int divisorSum(int n){
		int sum=0;
		
			for(int i=1; i<=n; i++){
				if(n%i==0){
					int x = n/i;
					sum = i + sum;
				}
			}	
		
		return sum;	
	}
}
public class Day19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		Ad my = new Calculator();
		System.out.println(my.divisorSum(n));
	}
}
