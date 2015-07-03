package freshlevel;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class XHAENEUNG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		String[] result = new String[cases];
		for(int i=0;i<cases;i++){
			
		int input1 = check(sc.next());
		String booho1 = sc.next();
		int input2 = check(sc.next());
		String booho2 =sc.next();
		int input3 =check(sc.next());
		
		if(booho1.equals("+")){
			int a=input1+input2;
			if(a==input3){
				result[i]="Yes";
			}else{
				result[i]="No";
			}
			
		}else if(booho1.equals("-")){
			int a=input1-input2;
			if(a==input3){
				result[i]="Yes";
			}else{
				result[i]="No";
			}
			
		}else if(booho1.equals("*")){
			int a=input1*input2;
			if(a==input3){
				result[i]="Yes";
			}else{
				result[i]="No";
			}
			
		}
			
		}
		
		for(int i=0;i<cases;i++){
			System.out.println(result[i]);
		}
	}
	
	public static int check(String word){
		String checkword="";
		char[] tmp = word.toCharArray();
		Arrays.sort(tmp);
		for(int i=0;i<tmp.length;i++){
			checkword+=tmp[i];
		}
		
		switch(checkword){
		case "eorz":return 0;
		case "eno":return 1;
		case "otw":return 2;
		case "eehrt":return 3;
		case "foru":return 4;
		case "efiv":return 5;
		case "isx":return 6;
		case "eensv":return 7;
		case "eghit":return 8;
		case "einn":return 9;
		case "ent":return 10;
		default :return Integer.MAX_VALUE;
		}
		
	}

}