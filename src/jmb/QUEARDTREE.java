package jmb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class QUEARDTREE {
	static BufferedReader stdin
    = new BufferedReader(new InputStreamReader(System.in));

	static int cnt;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int cases=Integer.parseInt(stdin.readLine());
		ArrayList<String> result = new ArrayList<String>();
		for(int c=0;c<cases;c++){
			
			
			
			String stmp = stdin.readLine();
			char[] car = stmp.toCharArray();
			
			
			int count=0;
			
			
			
		result.add(reverse(car));
			cnt=0;
			
			
			
		}
		
		for(int c=0;c<result.size();c++){
			System.out.println(result.get(c));
		}
	}

	public static String reverse(char[] car){
		if(cnt==car.length)
			return "";
		
		char head=car[cnt];
		cnt++;
		if(head=='w' || head=='b'){
			return String.valueOf(car[cnt-1]);
		}else{
			
			String uL=reverse(car);
			
			String uR=reverse(car);
			String dL=reverse(car);
			String dR=reverse(car);
			return "x"+dL+dR+uL+uR;
		}
		
		
		
	}
	
}
