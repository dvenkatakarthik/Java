package days;

import java.util.Scanner;



public class Day25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- > 0){
			int x = sc.nextInt();
			checkPrime(x);
		}
		sc.close();
	}
	
	static void checkPrime(int n){
		int sq = (int) Math.sqrt(n);
		
		if(n == 1){
			System.out.println("Not prime");
			return;
		}
		
		for(int i=2; i<=sq; i++){
			if(n%i == 0){
				System.out.println("Not prime");
				return;
			}
		}
		System.out.println("Prime");
	}

}
