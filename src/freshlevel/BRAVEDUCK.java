package freshlevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BRAVEDUCK {
	static BufferedReader stdin = new BufferedReader(new InputStreamReader(
			System.in));

	static int startx;
	static int starty;
	static int endx;
	static int endy;
	static int tempx = 0;
	static int tempy = 0;
	static int dolpansize;
	static int jpower;
	
	static boolean[][] dolpan;
	static int[][] dolarray;
	
	static boolean[] flagVisited;   
    static LinkedList<Integer> currSet;
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> result = new ArrayList<>();
		int cases = Integer.parseInt(stdin.readLine());
		for (int i = 0; i < cases; i++) {
			// String[] hw = stdin.readLine().split(" ");
			jpower = Integer.parseInt(stdin.readLine());
			int[] size = new int[4];

			String[] hw1 = stdin.readLine().split(" ");
			String[] hw2 = stdin.readLine().split(" ");
			size[0] = Integer.parseInt(hw1[0]);// 시작지점 와이 좌표
			size[1] = Integer.parseInt(hw1[1]);// 시작지점 엑스 좌표
			size[2] = Integer.parseInt(hw2[0]);// 종료지점 와이 좌표
			size[3] = Integer.parseInt(hw2[1]);// 종료지점 엑스 좌표
			
			
		startx = Integer.parseInt(hw1[1]) - 1;
			starty = Integer.parseInt(hw1[0]) - 1;
			endx = Integer.parseInt(hw2[1]) - 1;
			endy = Integer.parseInt(hw2[0]) - 1;
			Arrays.sort(size);
		

		
			int dol = Integer.parseInt(stdin.readLine());
			dolpansize=dol+2;
		 dolarray = new int[dolpansize][2];
			
			dolarray[0][0] = starty+1;
			dolarray[0][1] = startx+1;
			dolarray[dol+1][0] = endy+1;
			dolarray[dol+1][1] = endx+1;
			for (int z = 1; z < dol+1; z++) {
				String[] hw = stdin.readLine().split(" ");
				dolarray[z][1] = Integer.parseInt(hw[1]);
				dolarray[z][0] = Integer.parseInt(hw[0]);
				
			}
		/*	for(int k=0;k<dolpansize;k++){
				
				System.out.println(dolarray[k][0]+" "+dolarray[k][1]);
			}*/
			
			

			if (dolsearch( dolarray, jpower) == true) {
				result.add("YES");
			} else {
				result.add("NO");
			}
		}
		for (int i = 0; i < cases; i++) {
			System.out.println(result.get(i));
		}

	}
	static boolean dolsearch(int[][] dolarray,int jpower){
		boolean result=false;
		dolpan = new boolean[dolpansize][dolpansize];
		for(int i=0;i<dolpansize;i++){
			
			for(int k=0;k<dolpansize;k++){
				
				dolpan[i][k]=returndol(dolarray[i],dolarray[k],jpower);
				
			}
			
		}
		
		
		currSet = new LinkedList<>();
        flagVisited = new boolean[dolpansize];
        currSet.add(0);
        flagVisited[0] = true;
		
        while(!currSet.isEmpty()) {
        	System.out.println("currSet size===="+currSet.size());
            Integer[] rrr = getReachableList(currSet.removeFirst());
            System.out.println("rrr size"+rrr.length);
            for (int r : rrr) {
            	System.out.println("r========="+r);
                if(r == (dolpansize - 1))
                    result= true;
                if(!flagVisited[r]) {//아직 거치지 않은 정점을 분별하는 공식
                    currSet.add(r);
                    flagVisited[r] = true;
                }
            }
        }
		
		
		
		/*for(int i=0;i<dolpan.length;i++){
			int check=0;
			for(int k=0;k<dolpan[i].length;k++){
				if(dolpan[i][k]==true){
					check++;
				}
			}
			if(check<=1){
				
				result=false;
			}
			
		}*/
		
		
		for (int z = 0; z < dolpansize; z++) {
			for (int f = 0; f < dolpansize; f++) {
				System.out.print(dolpan[z][f]+" ");
			}
			System.out.println("");
		}
		
		
		return result;
	}
	static Integer[] getReachableList(int idx) {
		System.out.println("idx==="+idx);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < dolpansize; i++)
            if(dolpan[i][idx] && (i != idx))
                list.add(i);
       
        return list.toArray(new Integer[0]);
    }
	
	
	
	static boolean returndol(int[] from,int[] to,int jpower ){
		boolean result;
		
		 if(Math.sqrt((from[0] - to[0]) * (from[0] - to[0]) 
                + (from[1] - to[1]) * (from[1] - to[1])) <= jpower){
			
			 result=true;
		 }else{
			 result=false;
		 }
		
		 
		 return result;
	}
	
	

}
