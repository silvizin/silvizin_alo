package freshlevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CLOCKSYNC {
	static BufferedReader stdin = new BufferedReader(new InputStreamReader(
			System.in));
	 static int[][] button = {
		   {0, 1, 2},
           {3, 7, 9, 11},
           {4, 10, 14, 15},
           {0, 4, 5, 6, 7},
           {6, 7, 8, 10, 12},
           {0, 2, 14, 15},
           {3, 14, 15},
           {4, 5, 7, 14, 15},
           {1, 2, 3, 4, 5},
           {3, 4, 5, 9, 13}    
	    };
	 static int[] nlist=new int[16];
	 static int check=12;
	 static int MAXNUMBER=10000;
	public static void main(String[] args) throws NumberFormatException, IOException  {
		// TODO Auto-generated method stub
		int cases = Integer.parseInt(stdin.readLine().trim());
		
		int[] result = new int[cases];
		for(int a=0;a<cases;a++){
			StringTokenizer st = new StringTokenizer(stdin.readLine().trim());
			
			
			
			for(int i=0;i<16;i++){
				
				nlist[i]=Integer.parseInt(st.nextToken());
			}
			
			
			
			int tmp=controll(0);
			
			if( tmp < MAXNUMBER )
                result[a]=tmp;
            else
                result[a]=-1;	
			
		}
		for(int a=0;a<cases;a++){
			System.out.println(result[a]);
		}
		
	}
	public static boolean check(){
		
		boolean result=true;
		for(int c:nlist)
			result&= (c==12);
		
		return result;
	}
	public static void push(int n){
		
		for(int c:button[n] ){
			nlist[c]+=3;
			if(nlist[c]>=15)
				nlist[c]=3;
			
		
		}
		
	}
	public static int controll(int nbutton){
		
		int rcheck=MAXNUMBER;
		
		if(nbutton==10)
			return check()?0:MAXNUMBER;
		
		
		for(int i=0;i<4;i++){
			
			rcheck=Math.min(rcheck, i+controll(nbutton+1));
			push(nbutton);
		}
		
		
		return rcheck;
	}
	
	
	
}
