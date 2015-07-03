package jmb;

import java.io.BufferedReader;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOARDCOVER {
	 static BufferedReader stdin
     = new BufferedReader(new InputStreamReader(System.in));
	
	 static int h;
	 static int w;
	 static int[][][] covertype={
			 {{0,0},{1,0},{0,1}},
			 {{0,0},{0,1},{1,1}},
			 {{0,0},{1,0},{1,1}},
			 {{0,0},{1,0},{1,-1}}
			 };
	 
	 
	 public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 ArrayList<Integer> result = new ArrayList<>();
		int cases = Integer.parseInt(stdin.readLine());
		for(int i=0;i<cases;i++){
			String[] hw = stdin.readLine().split(" ");
			h=Integer.parseInt(hw[0]);
			w=Integer.parseInt(hw[1]);
			short[][] board=new short[h][w];
			int cnt=0;
			Character point='.';
			Character sharp='#';
		
			for(int a=0;a<h;a++){
				char[] tmpinput=stdin.readLine().toCharArray();
				for(int b=0;b<w;b++){
					if(point.equals(tmpinput[b])){
						cnt++;
					}
					if(tmpinput[b]=='#'){
					board[a][b]=1;
					}else if(tmpinput[b]=='.'){
						board[a][b]=0;	
					}
				}
				
			}
			if(cnt%3!=0){
				result.add(0);
			}
			result.add(cover(board));
			
			
		}
		for(int i=0;i<cases;i++){
			System.out.println(result.get(i));
		}
		
	}
	 public static boolean set(short[][] board, int y,int x,int type,int delta){
		 boolean ok=true;
		 for(int i=0;i<3;i++){
			 final int ny=y+covertype[type][i][0];
			 final int nx=x+covertype[type][i][1];
			 if(ny<0||ny>=board.length||nx<0||nx>=board[0].length){
				 ok=false;
			 }else if((board[ny][nx]+=delta)>1){
				 ok=false;
			 }
		 }
		 
		 
		 return ok;
	 }
	 
	 public static int cover(short[][] board){
		 
		 int y=-1;
		 int x=-1;
		 for(int i=0;i<board.length;i++){
			 for(int j=0;j<board[i].length;j++){
				 if(board[i][j]==0){
					 y=i;
					 x=j;
					 break;
				 }
				 
			 }
			 if(y!=-1)break;
		 }
		 if(y==-1) return 1;
		 int ret=0;
		 for(int type=0;type<4;type++){
			 if(set(board,y,x,type,1)){
				 ret+=cover(board);
			 }
			 set(board,y,x,type,-1);
		 }
		 return ret;
		 
	 }
}
