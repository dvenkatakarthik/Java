package days;
import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28 {

	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        //ArrayList<String> li = new ArrayList<String>();
        HashSet<String> li = new HashSet<String>();
        
        Pattern pat = Pattern.compile("[a-z]+@gmail.com");
        
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();                       
            
            if(pat.matches("[a-z]+@gmail.com", emailID)){        
            	li.add(firstName);          
            }                       
            
        }
    
        for(String ele: li){
        	System.out.println(ele);
        }
		
		
/*        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        ArrayList<String> li = new ArrayList<String>();
        
        Pattern pat = Pattern.compile("[a-z]+@gmail.com");
        
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();                       
            
            if(pat.matches("[a-z]+@gmail.com", emailID)){        
            	li.add(firstName);
            }                       
            
        }
        Collections.sort(li);    
        for(String ele: li){
        	System.out.println(ele);
        }*/
                            
	}
}
