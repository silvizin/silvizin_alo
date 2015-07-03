package jmb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Basic_LIS2 {
	
	static BufferedReader brin = new BufferedReader(new InputStreamReader(
			System.in));
	static int[] n;
	//static int[] result;
	static int[] cache;
	static int nsize;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int cases=Integer.parseInt(brin.readLine());
		//result=new int[cases];
		ArrayList<Integer> result = new ArrayList<>();
		for(int c=0;c<cases;c++){
			
			nsize = Integer.parseInt(brin.readLine());
			n = new int[nsize];
			cache=new int[nsize];
			for(int i=0;i<cache.length;i++){
				cache[i]=-1;
			}
			String[] stmp = brin.readLine().split(" ");
			for (int i = 0; i < nsize; i++) {
				n[i] = Integer.parseInt(stmp[i]);
			
			}
			result.add(lis2(-1));
		}
		for(int c=0;c<cases;c++){
			System.out.println(result.get(c));
		}
		

	}
	static int lis2(int start){
		int ret=cache[start];
		
		if(ret!=-1) return ret;
		cache[start]=1;
		ret=1;
		for(int next=start+1;next<nsize;next++){
			if(n[start]<n[next]){
				ret=Math.max(ret,lis2(next)+1 );
			}
		}
		return ret;
	}

}
