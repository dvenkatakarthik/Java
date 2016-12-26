package problems;
import java.util.*;
public class KMP {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> list = new ArrayList<Character>();
		list.add('a');
		char[] ch = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for(int i = 0; i < 26; i++){            
            int count = sc.nextInt();
            
            while(count>0){
            
            	System.out.print(ch[i]);
            	count--;
            }
        }
	}

}
