package freshlevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;




public class WEIRD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		ArrayList<String> rArrayList = new ArrayList<String>();
		if(cases<=200){
		for (int a = 0; a < cases; a++) {
			int numb = sc.nextInt();
			if (1 < numb & numb <= 500000) {
				int[] result = oper(numb);
				
				rArrayList.add(res(result, numb));

			}

			

		}
		for (int i = 0; i < rArrayList.size(); i++) {
			System.out.println(rArrayList.get(i));
		}
		}
	}

	public static String res(int[] result, int numb) {

		int a = 0;
		for (int i = 0; i < result.length; i++) {
		
			a += result[i];
		}
		
		int z = a - numb;
		ArrayList<Integer> list = new ArrayList<>();
		if (a >= numb) {
			int k = 0;

			for (int i = 0; i < result.length; i++) {

				if (z == result[i]) {
					
					return "not weird";
				}else if(z<result[i]){
					
					list.add(result[i]);
					
					
					
				}

			}
			int[]x;
			
			int index=list.size()-1;
			int sum=0;
			boolean ku= sumOfSubsets( index,  sum,  numb, list);
			if(ku==true){
				return "not weird";
			}else{
				return "werid";
			}
																		
			

		}

		else {

			return "not weird";

		}

		
	}

	public static int[] oper(int numb) {// 약수를 구하는 메소드
		int cnt = 0;
		for (int i = 1; i < numb; i++) {

			if (numb % i == 0) {
				cnt++;
			}

		}
		int[] check = new int[cnt];
		int a = 0;
		for (int i = 1; i < numb; i++) {

			if (numb % i == 0) {
				check[a] = i;
				a++;
			}

		}
		return check;

	}
	public static boolean sumOfSubsets(int index, int sum, int N,ArrayList<Integer> w) {  
	    if (sum == N) return true;  
	    if (sum < N || N < 0) return false;  
	  
	    //x[i+1] = 1;  
	    if (sumOfSubsets(index-1, sum-w.get(index), N-w.get(index),w)) {  
	        return true;  
	    }  
	    //x[i+1] = 0;  
	    return (sumOfSubsets(index-1, sum-w.get(index), N,w));  
	} 
}
