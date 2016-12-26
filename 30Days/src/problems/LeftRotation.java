package problems;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        in.nextLine();
        int a[] = new int[n];
        int b[] = new int[n];
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
        }
        int d = k;
        
        for(int j=0; j<n; j++){
        	if(d<n){
        		b[j] = a[d];
        	}
        	else{
        		b[j] = a[d-n];
        	}
        	d++;
        }
        for(int i=0; i < n; i++){
            System.out.print(b[i]+" ");
        }
    }
}
