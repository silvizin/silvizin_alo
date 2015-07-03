package freshlevel;

import java.util.ArrayList;
import java.util.Scanner;

public class WEEKLYCALENDAR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		ArrayList<String> result = new ArrayList<>();
				for(int i=0;i<cases;i++){
					
					int m = sc.nextInt();
					int d = sc.nextInt();
					String yoil = sc.next();
					result.add(calendar(m,d,yoil));
					
				}
				for(int i=0;i<cases;i++){
					System.out.println(result.get(i));
				}
	}
	public static String calendar(int m,int d, String yoil){
				String result = "";
				int where = 0;
				int[] ncal = new int[7];
				String[] s = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
				
					for(int i=0;i<7;i++){
						if(s[i].equals(yoil)){
							where=i;
						};
					}
					
				
				//System.out.println("where=="+where);
				ncal = yo(m,d,where);
				for(int i=0;i<6;i++){
					
					result+=String.valueOf(ncal[i])+" ";
					
				}
				result+=String.valueOf(ncal[6]);
				
		return result;
	}
	
	public static int[] yo(int m,int d,int where){
		int[] result = new int[7];
		int max = 0;
		int[][] month = {{1,3,5,7,8,10,12},{4,6,9},{2}};
		for(int a=0;a<3;a++){
			for(int b=0;b<month[a].length;b++){
				if(m==month[a][b]){
					if(a==0){
					max=31;	
					}else if(a==1){
						max=30;
					}else if(a==2){
						max=28;
					}
				}
			}
			
		}
	//	System.out.println("max=="+max);
		int dtmp=d;
			for(int k=where;k<result.length;k++){
				
				result[k]=dtmp;
				dtmp++;
				if(dtmp>max){
					dtmp=1;
				}
			}
			int cnt=0;
			int tmp=0;
			for(int k=0;k<result.length;k++){
				if(result[k]==0){
					cnt++;
				}
			}
			tmp=d-cnt;
			if(tmp<=0){
				tmp=max-cnt+1;
			}
			
			/*System.out.println("cnt="+cnt);
			System.out.println("tmp="+tmp);*/
			for(int k=0;k<cnt;k++){
				result[k]=tmp;
				tmp++;
			}
		
		
		return result;
	}
}
