package days;
import java.util.*;

public class Day26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int ad,am,ay;
		int ed,em,ey;
		int h = 0;
		ad = sc.nextInt();
		am = sc.nextInt();
		ay = sc.nextInt();
		
		ed = sc.nextInt();
		em = sc.nextInt();
		ey = sc.nextInt();
		
        if(ay < ey){
			h = 0;
		}
		else if(ay == ey){
			if(am < em){
				h = 0;
			}
			else if(am == em){
				if(ad < ed){
					h = 0;
				}
				else if(ad == ed){
					h = 0;
				}
				else{
					h = (ad-ed)*15;
				}
			}
			else{
				h = (am-em)*500;
			}
		}
		else{
			h = 10000;
		}
		
		System.out.println(h);		
	}

}
