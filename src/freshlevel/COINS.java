package freshlevel;

import java.util.Scanner;



public class COINS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		for(int i=0;i<cases;i++){
			
			int money = sc.nextInt();
			int spec = sc.nextInt();
			int[] sarray = new int[spec];
			int[] rarray= new int[spec];
			for(int a=0;a<spec;a++){
				sarray[a] = sc.nextInt();
				rarray[a] = cal(money,a+1,sarray);
			}
			
			for(int a=0;a<cases;a++){
				System.out.println(rarray[a]);
			}	
			
		}
		
	}

	public static int cal(int money,int time,int[] sarray){
		int count=0;
		int tmp=0;
		for(int i=0;i<time;i++){
			if(money%sarray[i]==0){
				count++;
			}else if(money%sarray[i]>0){
				tmp=money%sarray[i];
				for(int a=1;a<time;a++){
					if(tmp%sarray[a]==0)
					{	
						count++;
						return count;
					}
					}
					
				
			}
			
		}
		
		return count;
	}
	
}
