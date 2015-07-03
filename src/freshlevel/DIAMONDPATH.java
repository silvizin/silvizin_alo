package freshlevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DIAMONDPATH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int cases =sc.nextInt();
		ArrayList<Integer> result = new ArrayList<>();
		for(int i=0;i<cases;i++){
			
			int n = sc.nextInt();
			int[][] dia = new int[2*n-1][n];
			int c=0;
			for(int a=0;a<(2*n)-1;a++){
			
				if(a<=n-1){	
					for(int b=0;b<=a;b++){
					dia[a][b]=sc.nextInt();
				
					}
				}else{
					++c;
					
					for(int b=c;b<n;b++){
					dia[a][b]=sc.nextInt();
			
					
					}
					
				}
			
				
			}
			
			result.add(gil(dia,n));
			
	
			
		}
		sc.close();
		for(int i=0;i<cases;i++){
			System.out.println(result.get(i));
			
		}
	}

	public static int gil(int[][] a,int number){
		
		int[][] result = new int[2*number-1][number];
		result[0][0]=a[0][0];

		for(int y=1;y<2*number-1;y++ ){
			
			
			
			for(int x=0;x<number;x++){
				if(a[y][x]==0){
					
					
					continue;
				}else if(x==0){
					result[y][x]=result[y-1][x]+a[y][x];
				
					
				}else if(a[y-1][x]==0){
					
					result[y][x] = result[y-1][x-1]+a[y][x];
			
				}else{
					
					if(result[y-1][x]>result[y-1][x-1]){
						result[y][x] = result[y-1][x]+a[y][x];
					
					}else{
						result[y][x] = result[y-1][x-1]+a[y][x];
					
					}
					
				}
			}
			}
		return result[2*number-2][number-1];
	}
	
}
