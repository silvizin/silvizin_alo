package jmb;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class FANMEETING {
	static BufferedReader brin = new BufferedReader(new InputStreamReader(
			System.in));
	//static int[] C;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int cases= Integer.parseInt(brin.readLine());
		ArrayList<Integer> result = new ArrayList<>();
		for(int c=0;c<cases;c++){
			
			String sidol=brin.readLine();
			String sfan=brin.readLine();
			
			result.add(hugs(sidol,sfan));
			
		}
		for(int c=0;c<cases;c++){
			System.out.println(result.get(c));
		}
	}
	static int hugs(String sidol,String sfan){
		int ret=0;
		int N=sidol.length();
		int M=sfan.length();
		int[] A= new int[N];
		int[] B= new int[M];
		Stack<Integer> Awhere = new Stack<>();
		for(int i=0;i<N;i++){
			//A[i]=(sidol.charAt(i)=='M'?1:0);
			//System.out.println(A[i]);
			
			if(sidol.charAt(i)=='M'){
				A[i]=1;
				Awhere.push(i);
			}
		}
		Stack<Integer> Bwhere = new Stack<>(); 
		for(int i=0;i<M;i++){
		//	B[M-i-1]=(sfan.charAt(i)=='M'?1:0);
			if(sfan.charAt(i)=='M'){
				B[M-i-1]=1;
				Bwhere.push(M-i-1);
			}
		}
		
		int[] C = karatsuba(A,B,Awhere,Bwhere);
	//	System.out.println("c lenth=="+C.length+"N=="+N+"M=="+M);
		for(int i=N-1;i<M;i++){
			
			if(C[i]==0){
				ret++;
			}
		}
		
		return ret;
	}
	
	static int[] karatsuba(int[] A, int[] B, Stack<Integer> Awhere,Stack<Integer> Bwhere){
		
		int[] C = new int[A.length+B.length+1];
		for(int i=0;i<Awhere.size();i++){
			
			for(int j=0;j<Bwhere.size();j++){
				C[Awhere.get(i)+Bwhere.get(j)]+=A[Awhere.get(i)]*B[Bwhere.get(j)];
			}
		}
		
		return C;
	}
	
}
