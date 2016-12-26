/*
 * Day 10: 2D Arrays
 * 
 * */
package problems;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
                //System.out.println(arr[i][i]);
            }
        }
        int maxval = -64;
        for(int i=1; i < 5; i++){
            for(int j=1; j < 5; j++){
                int val = arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]+arr[i][j]+arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1];
                if(maxval < val) maxval= val;
            }
        }
        System.out.println(maxval);
    }   
}
