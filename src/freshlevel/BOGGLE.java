package freshlevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BOGGLE {

	private static final boolean TRUE = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		int cases = sc.nextInt();
		for(int i=0;i<cases;i++){
			
			//String word = sc.next();
			
			Character[][] carray = new Character[5][5];
		/*	for(int x=0;x<5;x++){
				String word = sc.next();
				for(int y=0;y<5;y++){
					carray[x][y]=word.charAt(y);
					
					
				}
				
			}*/
			int count=sc.nextInt();
			String[] sword = new String[count];
			
			for(int a=0;a<count;a++){
				sword[a]=sc.next();
				sword[a] = sorting(sword[a]);
				
				
			}
			for(int a=0;a<count;a++){
				System.out.println(sword[a]);
			}
			/*for(int x=0;x<5;x++){
				for(int y=0;y<5;y++){
					
					System.out.print(carray[x][y]);
					
				}
				System.out.println();
				
			}*/
			
		}
	}
	public static String sorting(String word){
		
			String checkword="";
			int cnt=0;
			char[] tmp = word.toCharArray();
			Arrays.sort(tmp);
			for(int i=0;i<tmp.length;i++){
				checkword+=tmp[i];
				
			}
			char[] temp1 = checkword.toCharArray();
			char[] temp2 = checkword.toCharArray();
			for(int i=0;i<checkword.length();i++){
				
				for(int j=0;j<checkword.length();j++){
					
					if(temp1[i]==temp2[j]){
						cnt++;
					}
					
					if(cnt>=2){
						
						temp2[j]=(Character) null;
					}
					cnt=0;
				}
				
				
				
			}
			checkword=null;
			for(int i=0;i<temp2.length;i++){
				checkword+=temp2[i];
			}
			
			return checkword;
			
	}
	
	public static boolean search(char[][] carray, String[] sword){
		
		Boolean result = null;
		
		
		return result;
	}
}
