package jmb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class FENCE {
	static BufferedReader br = new BufferedReader(new InputStreamReader(
			System.in));
	static int[] fence;
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int cases = Integer.parseInt(br.readLine());
		ArrayList<Integer> result = new ArrayList<>();
		for(int c=0;c<cases;c++){
			
			int fnumber = Integer.parseInt(br.readLine());
			fence = new int[fnumber];
			String[] wtmp = br.readLine().split(" ");
			
			for(int i=0;i<fence.length;i++){
				fence[i]=Integer.parseInt(wtmp[i]);
		
			}
			
			
			
	
		
			
			
		
			result.add(solve(0,fence.length-1));
		}
		for(int c=0;c<cases;c++){
			System.out.println(result.get(c));
		}
		
	}

	public static int solve(int left,int right){
		if(left==right){
			return fence[left];
		}
		int mid=(left+right)/2;
		int ret=Math.max(solve(left,mid),solve(mid+1,right));
		int lo=mid;
		int hi=mid+1;
		int height=Math.min(fence[lo], fence[hi]);
		
		ret=Math.max(ret,(height*2));
		while(left<lo||hi<right){
			if(hi<right&&(lo==left||fence[lo-1]<fence[hi+1])){
				++hi;
				height=Math.min(height,fence[hi]);
			
				
							
			}else{
				--lo;
				height=Math.min(height, fence[lo]);
			
			}
			ret = Math.max(ret, height*(hi-lo+1));
			
			
		}
		
		return ret;
		
	
	}
}
