package jmb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Basic_LIS1 {
	static BufferedReader brin = new BufferedReader(new InputStreamReader(
			System.in));
	static int[] n;
	

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub
		int cases = Integer.parseInt(brin.readLine());
		ArrayList<Integer> result=new ArrayList<>();
		
		for (int c = 0; c < cases; c++) {
			ArrayList<Integer> gu=new ArrayList<>();
			int nsize = Integer.parseInt(brin.readLine());
			n = new int[nsize];
			// for(int i=0;i<nsize;i++){
			String[] stmp = brin.readLine().split(" ");
			for (int i = 0; i < nsize; i++) {
				n[i] = Integer.parseInt(stmp[i]);
				gu.add(n[i]);
			}
		/*	for (int i = 0; i < nsize; i++) {
				System.out.print(n[i] + " ");
			}
*/
		result.add(solve(gu));	
		
		
		}
		for(int i=0;i<cases;i++){
			System.out.println(result.get(i));
		}
	}

	static int solve(ArrayList<Integer> gu) {
	
		if(gu.isEmpty()) return 0;
	
		//System.out.println("n.lenth==" + n.length);
		int ret=0;
		
		for (int i = 0; i < gu.size(); i++) {
			ArrayList<Integer> tmp = new ArrayList<>();
			for (int k = i + 1; k < gu.size(); k++) {
				
				if (gu.get(i) < gu.get(k)) {
					/*System.out
					 * 							.println("chk1  " + n[i] + " " + n[k] + "z==" + z);*/
					tmp.add(gu.get(k));
				//	System.out.println();
				}
				
			}
			
			ret = Math.max(ret, 1+solve(tmp));
			//System.out.println(tmp.size());
			
		}
		/*
		 * for(int i=0;i<save.length;i++){
		 * 
		 * slenth[i]=save[i].length;
		 * 
		 * } Arrays.sort(slenth);
		 */
		return ret;
		
	}

}
