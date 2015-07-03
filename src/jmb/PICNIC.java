package jmb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PICNIC {
	static int student;
	static int f;
	static boolean[] taken;
	static boolean[][] fjjak;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		ArrayList<Integer> result = new ArrayList<>();
		for (int c = 0; c < cases; c++) {
			student = sc.nextInt();
			f = sc.nextInt();
			taken = new boolean[student];
			fjjak = new boolean[student][student];
			for (int i = 0; i < f; i++) {
				int cnt1 = sc.nextInt();
				int cnt2 = sc.nextInt();
				
				fjjak[cnt1][cnt2] = true;
				fjjak[cnt2][cnt1] = true;

			}
		
			result.add(countfriend(taken));
			

		}
		for(int c=0;c<cases;c++){
			System.out.println(result.get(c));
		}
		
		

		sc.close();

	}
	static int countfriend(boolean[] taken){
		int firstFree=-1;
		for(int i=0;i<student;i++){
			if(!taken[i]){
			
				firstFree=i;
				break;
			}
			
		}
		if(firstFree==-1) return 1;
		int ret=0;
		for(int pairWith=firstFree+1;pairWith<student;++pairWith){
			if(!taken[pairWith]&&fjjak[firstFree][pairWith]){
				taken[firstFree]=taken[pairWith]=true;
				ret+=countfriend(taken);
				taken[firstFree]=taken[pairWith]=false;
			}
			
		}
		
		return ret;
	}

}