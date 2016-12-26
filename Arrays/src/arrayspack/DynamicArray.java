package arrayspack;
import java.util.*;
public class DynamicArray {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		
		List<Integer>[] arr = new List[N];
		for(int i=0; i<N;i++){
			arr[i] = new ArrayList<Integer>();
		}
		int lastAns = 0;
		
		while(Q-- > 0){
			int q = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			List<Integer> seq = (ArrayList)arr[(x^lastAns)%N];
			switch(q){
			case 1: 
				seq.add(y);
				break;
			case 2:
				lastAns = seq.get(y%seq.size());
				System.out.println(lastAns);
			}
			
		}
	}

}
