package arrayspack;
import java.util.*;

public class Ds2DArray {

	public static void main(String[] args) {
		
	    Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        in.close();
        int ans = -64;
        for(int i=1;i<5;i++){
        	for(int j=1; j<5;j++){
        		//System.out.print(arr[i][j]);
        		int x = sum(arr,i,j);
        		if(ans < x) ans = x;
        	}
        	//System.out.println();        	
        }
    	System.out.println(ans);
	}
	
	public static int sum(int[][] a, int i, int j){
		return a[i][j]
				+a[i-1][j-1]+a[i-1][j]+a[i-1][j+1]
				+a[i+1][j-1]+a[i+1][j]+a[i+1][j+1]
				;
	}

}
