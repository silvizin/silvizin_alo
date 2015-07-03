package jmb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Total_LIS1 {
	static BufferedReader brin = new BufferedReader(new InputStreamReader(
			System.in));
	static int[] n1 = new int[100];
	static int[] n2 = new int[100];
	static int[][] cache = new int[101][101];
	static int nsize1;
	static int nsize2;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int cases = Integer.parseInt(brin.readLine());
		ArrayList<Integer> result = new ArrayList<>();
		for (int c = 0; c < cases; c++) {
			for(int i=0;i<cache.length;i++){
				for(int k=0;k<cache[i].length;k++){
					cache[i][k]=-1;
				}
			}
			
			String hw[] = brin.readLine().split(" ");
			nsize1 = Integer.parseInt(hw[0]);
			nsize2 = Integer.parseInt(hw[1]);
			String nw1[] = brin.readLine().split(" ");
			String nw2[] = brin.readLine().split(" ");
			for (int i = 0; i < nsize1; i++) {
				n1[i] = Integer.parseInt(nw1[i]);
			}
			for (int i = 0; i < nsize2; i++) {
				n2[i] = Integer.parseInt(nw2[i]);
			}
			
			result.add(lis(-1,-1));

		}
		
		for(int c=0;c<result.size();c++){
			System.out.println(result.get(c));
		}
	}
	static int lis(int indexa,int indexb){
		int ret=cache[indexa+1][indexb+1];
		if(ret!=-1) return ret;
		
		ret=0;
		
		
		long a=(indexa==-1?Long.MIN_VALUE:n1[indexa]);
		long b=(indexb==-1?Long.MIN_VALUE:n2[indexb]);
		long maxlen=Math.max(a, b);
		
		for(int nexta=indexa+1;nexta<nsize1;nexta++){
			if(maxlen<n1[nexta]){
				ret=Math.max(ret, lis(nexta,indexb)+1);
			}
			
		}
		for(int nextb=indexb+1;nextb<nsize2;nextb++){
			if(maxlen<n2[nextb]){
				ret=Math.max(ret, lis(indexa,nextb)+1);
			}
			
		}
		
		
		/*for(int nexta=indexa+1;nexta<nsize1;nexta++){
			if(indexa==-1){
				ret=Math.max(ret, lis(nexta,indexb));
			}else if(n1[indexa]<n1[nexta]){
				ret=Math.max(ret, lis(nexta,indexb)+1);
			}
			
		}
		for(int nextb=indexb+1;nextb<nsize2;nextb++){
			if(indexb==-1){
				ret=Math.max(ret, lis(indexa,nextb));
			}else if(n2[indexb]<n2[nextb]){
				ret=Math.max(ret, lis(indexa,nextb)+1);
			}
			
		}*/
		cache[indexa+1][indexb+1]=ret;
		return ret;
	}
}
