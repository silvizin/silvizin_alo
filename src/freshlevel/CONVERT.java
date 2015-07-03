package freshlevel;

import java.util.ArrayList;
import java.util.Scanner;

public class CONVERT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		ArrayList<String> rArrayList = new ArrayList<String>();
		String[] text = new String[1000];
		
		float[] number = new float[1000];
		
		
			
			for(int i=0;i<cases;i++){
				
				number[i]=sc.nextFloat();
				text[i]=sc.next();
				
				if(text[i].equals("kg")){
					if(number[i]==0){
						text[i]="lb";
						
					}
					float ref=(float) 2.2046;
					float temp=0;
					
					temp=number[i]*ref;
					temp=(Math.round(temp*10000F)/10000F);
					text[i]="lb";
					number[i]=temp;
					
				}else if(text[i].equals("l")){
					if(number[i]==0){
						
						text[i]="g";
						
					}
					
					float ref=(float) 0.2642;
					float temp=0;
					
					temp=number[i]*ref;
					temp=(Math.round(temp*10000F)/10000F);
					number[i]=temp;
					text[i]="g";
					
				}else if(text[i].equals("lb")){
					if(number[i]==0){
						text[i]="kg";
						
					}
					float ref=(float) 0.4536;
					float temp=0;
					temp=number[i]*ref;
					
					temp=(Math.round(temp*10000F)/10000F);
					text[i]="kg";
				number[i]=temp;
				}else{
					if(number[i]==0){
						text[i]="l";
						
					}
					float ref=(float) 3.7854;
					float temp=0;
					temp=number[i]*ref;
					temp=(Math.round(temp*10000F)/10000F);
				number[i]=temp;
				text[i]="l";
					
				}
				
			}
			
			
			
		
		
		for(int i=0;i<cases;i++){
			String t = String.format("%.4f", number[i]);
			System.out.println((i+1)+" "+t+" "+text[i]);
			
		}
	}

}
