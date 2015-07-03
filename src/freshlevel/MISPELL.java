package freshlevel;

import java.util.ArrayList;
import java.util.Scanner;

public class MISPELL {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int cases = sc.nextInt();
		ArrayList<String> rArrayList = new ArrayList<String>();
		while(cases-->0){
			
			int where = sc.nextInt();
			String word = sc.next();
			String[] wordarray= new String[80];
			for(int i=0;i<word.length();i++){
			wordarray[i]=word.substring(i, i+1);
				
			}
			String temp=word;
			word="";
			
			wordarray[where-1]="";
			for(int i=0;i<temp.length();i++){
				word+=wordarray[i];
				
			}
			rArrayList.add(word);
			word="";
		}
		
		for(int i=0;i<rArrayList.size();i++){
			System.out.println((i+1)+" "+rArrayList.get(i));
		}
	}

}
