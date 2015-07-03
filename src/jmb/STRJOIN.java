package jmb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class STRJOIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cases= sc.nextInt();
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i=0;i<cases;i++){
			
			int numb = sc.nextInt();
			ArrayList<Integer> numblist = new ArrayList<>();
			for(int k=0;k<numb;k++){
				numblist.add(sc.nextInt());
				
			}
			
			result.add(search(numblist));
		}
		for(int i=0;i<cases;i++){
			
			System.out.println(result.get(i));
		}
		
		
	}
	public static int search(ArrayList<Integer> numblist){
		
		ArrayList<Integer> result= new ArrayList<>();
		int tmp1=0;
		int tmp2=0;
		//result.add(tmp);
		int cost=0;
		while(numblist.size()>1){
			Collections.sort(numblist);
			tmp1=numblist.remove(0);
			tmp2=numblist.remove(0);
			cost+=(tmp1+tmp2);
			numblist.add(0,tmp1+tmp2);
			Collections.sort(numblist);
		
		}
	
		
		return cost;
	}

}
