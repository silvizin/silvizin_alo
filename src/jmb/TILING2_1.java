package jmb;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class TILING2_1 {
	static BufferedReader brin = new BufferedReader(new InputStreamReader(System.in));
	static int N;
	static int[] ca=new int[101];
	static int[][] til;
	static int max=1000000007;
	
	
	public static void main(String[] args)  throws Exception{
		// TODO Auto-generated method stub
		int cases= Integer.parseInt(brin.readLine());
		ArrayList<Integer> result = new ArrayList<>();
		for(int c=0;c<cases;c++){
			
			 N = Integer.parseInt(brin.readLine());
			 til = new int[2][N];
			Arrays.fill(ca, -1);
			result.add(solve(N));
			for(int i=0;i<N;i++){
				System.out.println("ca=="+ca[i]);
			}
		}
		
		for(int c=0;c<cases;c++){
			System.out.println(result.get(c));
		}
	}
	public static int solve(int width){
		
		//기저사례 : width가 1이하일때
		if(width<=1) return 1;
		
		int ret=ca[width];
		if(ret!=-1) return ret;
		
		
		 ret=(solve(width-2)+solve(width-1))%max;
		 ca[width]=ret;
		 return ret;
		
		
	}
}
