package problems;
import java.io.*;
import java.util.*;

public class EvenOddStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		String[] inputs = new String[t];
		for(int x=0; x<t ; x++){
			inputs[x] = sc.nextLine();			
		}		
		for(int i=0; i<t ; i++){
			char[] onestring = inputs[i].toCharArray();
			int len = onestring.length;
			int h1,h2;
			if(len%2 == 0){
				h1 = len/2;
				h2 = len/2;				
			}
			else{
				h1 = 1 + (len/2);
				h2 = len/2;
			}
			char[] first = new char[h1];
			char[] second = new char[h2];
			
			int k = 0, l=0;
			
			for( int j=0; j<len ; j++){
				
				if(j%2 == 0){
					first[k] = onestring[j];
					k++;
				}
				else{
					second[l] = onestring[j];
					l++;
					
				}								
			}
			String fir = String.valueOf(first);			
			String sec = String.valueOf(second);			
			System.out.println(fir+" "+sec);			
		}

	}

}
