package jmb;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class JUMPGAME {
	static BufferedReader stdin = new BufferedReader(new InputStreamReader(
			System.in));
	static final int yes=2;
	static final int no=1;
	static final int fresh=0;
	static int[][] board = new int[100][100];
	static int[][] tmp;
	static int n;
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int cases = Integer.parseInt(stdin.readLine());
		ArrayList<String> result = new ArrayList<>();
		for(int c=0;c<cases;c++){
			
			n=Integer.parseInt(stdin.readLine());
			tmp=new int[n][n];
			
			
			String[][] hw = new String[n][n];
			for(int i=0;i<n;i++){
				hw[i]=stdin.readLine().split(" ");
				for(int k=0;k<n;k++){
					board[i][k]=Integer.parseInt(hw[i][k]);
				}
				
			}
			/*for(int i=0;i<n;i++){
				
				for(int k=0;k<n;k++){
					 System.out.print(board[i][k]);
				}
				System.out.println();
			}*/
			
			
		
			if(solve(0,0)==true){
				/*System.out.println();
				for(int i=0;i<n;i++){
					
					for(int k=0;k<n;k++){
						 System.out.print(tmp[i][k]);
					}
					System.out.println();
				}*/
				
				result.add("YES");
			}else{
				/*System.out.println();
				for(int i=0;i<n;i++){
					
					for(int k=0;k<n;k++){
						 System.out.print(tmp[i][k]);
					}
					System.out.println();
				}*/
				result.add("NO");
			}
			
			
		}
		
		for(int c=0;c<cases;c++){
			System.out.println(result.get(c));
			
		}
	}
 static boolean solve(int y, int x){
		
		if(y>=n||x>=n)return false;
		if(y==n-1&&x==n-1) return true;
		if(tmp[y][x]!=fresh) return tmp[y][x]==yes;
		
		tmp[y][x] = (solve(y, x + board[y][x])
                || solve(y + board[y][x], x))? yes : no;
		
		return (tmp[y][x]==yes);
	}
	
}