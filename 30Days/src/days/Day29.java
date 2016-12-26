package days;
import java.util.*;
public class Day29 {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	            int n = in.nextInt();
	            int k = in.nextInt();
	            System.out.println(checkMax(n,k));
	        }
	        
	}
	public static int checkMax(int n, int k){
		
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=1; i<n; i++){
			for(int j=2;j<=n;j++){
				int x = i & j;
				hs.add(x);
			}
		}
		k = k--;
		while(k-- > 0){
			if(hs.contains(k))
				return k;
		}		
		return 0;
	}
}
