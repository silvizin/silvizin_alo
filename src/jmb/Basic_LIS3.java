package jmb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Basic_LIS3 {
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
			cache=new int[nsize+1];
			for(int i=0;i<cache.length;i++){
				cache[i]=-1;
			}
			String[] stmp = brin.readLine().split(" ");
			for (int i = 0; i < nsize; i++) {
				n[i] = Integer.parseInt(stmp[i]);
			
			}
			result.add(lis3(0));
		}
		for(int c=0;c<cases;c++){
			System.out.println(result.get(c));
		}
	}
	static int lis3(int start){
		int ret=cache[start+1];
		if(ret!=-1) return ret;
		ret=1;
		cache[start+1]=1;
		for(int next=start+1;next<nsize;next++){
			
			if(start==-1||n[start]<n[next]){
				ret=Math.max(ret, lis3(next)+1);
			}
		}
			
		
		return ret;
	}

}
