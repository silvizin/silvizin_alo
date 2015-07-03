package jmb;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class PI {
	static BufferedReader brin = new BufferedReader(new InputStreamReader(
			System.in));
	static int[] wd;
	static int[] ca;
	static int wdlenth;
	static String s;
	
	static int max=987654321;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int cases=Integer.parseInt(brin.readLine());
		ArrayList<Integer> result=new ArrayList<>();
		for(int c=0;c<cases;c++){
			 s= brin.readLine();
		
			wd=new int[s.length()];
			wdlenth=s.length();
			
			ca=new int[s.length()];
			Arrays.fill(ca, -1);
			/*for(int i=0;i<s.length();i++){
				wd[i]=Integer.parseInt((String) s.subSequence(i, i+1));
				ca[i]=-1;
			}*/
			/*for(int i=0;i<wd.length;i++){
				System.out.println(wd[i]);
			}*/
			result.add(memorize(0));
			
		}
		for(int c=0;c<cases;c++){
			System.out.println(result.get(c));
		}
	
	}

	static int pisolve(int start,int last){
		
		
		//case1: equal
		String tmp=s.substring(start, last+1);
		String case1="";
		for(int i=start;i<last+1;i++){
			case1+=tmp.substring(0, 1);
		}
		if(tmp.equals(case1)) return 1;
		
		//case2: +1 or -1
		boolean progressive =true;
		
		for(int i=0;i<tmp.length()-1;i++){
			
			if(Integer.parseInt(tmp.substring(i+1, i+2))-Integer.parseInt(tmp.substring(i, i+1))!=Integer.parseInt(tmp.substring(1, 2))-Integer.parseInt(tmp.substring(0, 1)))
			progressive=false;
		}
		if(progressive&&Math.abs(Integer.parseInt(tmp.substring(1, 2))-Integer.parseInt(tmp.substring(0, 1)))==1){
			return 2;
		}
		//case3: alternating
		boolean alternate=true;
		for(int i=0;i<tmp.length();i++){
			char a=tmp.charAt(i);
			char b=tmp.charAt(i%2);
			if(a!=b) alternate=false;
		}
		if(alternate) return 4;
		if(progressive) return 5;
		return 10;
	}
	static int memorize(int begin){
		if(begin==s.length()) return 0;
		
		int ret = ca[begin];
		if(ret!=-1) return ret;
		
		ret=max;
		for(int l=3;l<=5;l++){
			if(begin+l<=s.length()){
				ret=Math.min(ret, memorize(begin+l)+pisolve(begin,begin+l-1));
			}
		}
		ca[begin]=ret;
		return ret;
	}
	
}
