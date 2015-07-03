package jmb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class TRIANGLEPATH_2 {

	
	static int N;
	static int[][] ar;
	static int[][] ca;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		for(int c=0;c<cases;c++){
		N=sc.nextInt();
		ar=new int[N][N];
		for(int i=0;i<N;i++){
			for(int j=0;j<=i;j++){
				
				ar[i][j]=sc.nextInt();
				
			}
			
		}
		ca=new int[100][100];
		for(int y=0;y<ca.length;y++){
			for(int x=0;x<ca[y].length;x++){
				ca[y][x]=-1;
			}
		}
		
		//Arrays.fill(ca, -1);
	//	Arrays.fill(ca[][], -1);
		/*for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				
				System.out.print(ar[i][j]+" ");
				
			}
			System.out.println();
		}*/
		
		int res=path2(0,0);
		System.out.println(res);
		
		}
		
		
		
	}

	static int path2(int y,int x){
		if(y==N-1) return ar[y][x];
		
		int ret=ca[y][x];
		
		if(ret!=-1) return ret;
		
		ca[y][x]=Math.max(path2(y+1,x),path2(y+1,x+1))+ar[y][x];
				
		return ret=Math.max(path2(y+1,x),path2(y+1,x+1))+ar[y][x];
	}
}
