package problems;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Contacts {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[] contacts = new String[n];
        String[] commands = new String[n];
        int count1 = 0, count2 = 0,count=0;
        for(int a= 0; a < n; a++){
        	String input = in.nextLine();
                                  
            String[] parts = input.split("\\s+");
            String command = parts[0];
            String value = parts[1];
            if(command.equals("add"))
            {
            	contacts[count1] = value;
            	count1++;
            }
            else
            {
            	commands[count2] = value;
            	count2++;
            }                   	
        }
        for(int i=0; i<count2; i++){
        	for(int j=0; j<count1; j++){
        		if(contacts[j].startsWith(commands[i]))
        			count++;
        	}
        	System.out.println(count);
        	count = 0;
        }

    }
}
