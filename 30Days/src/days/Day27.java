package days;

public class Day27 {

	public static void main(String[] args) {
		
        int[] na = new int[1000];
        int[] pa = new int[1000];
        
        for(int i=-1000; i<0; i++){
            na[i+1000] = i;
        }
        
        for(int i=1000; i>0; i--){
            pa[1000-i] = i;
        }
        
        int i1=-1, i2=0,i3=1;
        
        int T=5;
        System.out.println(T);
        
        for(int i=0; i<T;i++){
        	
        	//int nrand = (int) (Math.random()*100);
        	int nrand = 10;
        	int krand = 4;
        	
        	if(nrand < 4) 
        		nrand = nrand + 8;
        	
        	//int krand = (int) (Math.random()*nrand);
        	if((nrand - krand) < 3){
        		if(nrand > 995){
        			krand = krand - 4;
        		}
        		else{
        			nrand = nrand + 4;
        		}
        	}
        	if(krand < 4){
        		krand = krand + 10;
        		nrand = 76;
        	}
        	
        	System.out.println(nrand+" "+krand);
        	
        	int count = krand-5;
        	
        	int looppass=3;
        	
            for(int j=0;j<nrand;j++){
            	
            	if(looppass == 0){
            	int rand = (int) (Math.random()*999);
               		
               		if(i%2 == 0){
               			if(count > 1){
                   			System.out.print(na[rand]+" ");
                   			count--;
                   		}               			
                   		else{
                   			System.out.print(pa[rand]+" ");
                   		}
               		}
               		else{
               			if(count > 1){
                   			System.out.print(pa[rand]+" ");
                   			count--;
                   		}               			
                   		else{
                   			System.out.print(na[rand]+" ");
                   		}
               		}             		
            		
            	}
            	else{
            		System.out.print(i1+" ");
            		System.out.print(i2+" ");
            		System.out.print(i3+" ");
            		looppass = 0;
            	}
            	
            	
             
            }
           System.out.println();        	
        }                          
	}

}
