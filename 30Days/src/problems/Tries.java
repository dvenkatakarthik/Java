package problems;
import java.util.*;
public class Tries {

	public static void main(String[] args) {
		
		ArrayList<String> contacts = new ArrayList<String>();
		ArrayList<String> commands = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for(int a= 0; a < n; a++){
        	String temp = in.nextLine();
        	if(temp.startsWith("add")){
        		String[] t = temp.split("\\s+");
        		contacts.add(t[1]);
        	}
        	else{
        		String[] cc = temp.split("\\s+");
        		commands.add(cc[1]);
        	}
        }
       int count = 0;
        for(String cm: commands){        	 
             	for(String co: contacts){
             		if(co.startsWith(cm)) count++;
             	}
                System.out.println(count);
                count = 0;
        }     
	}

}
