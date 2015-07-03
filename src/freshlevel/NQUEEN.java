package freshlevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NQUEEN {
	static BufferedReader stdin = new BufferedReader(new InputStreamReader(
			System.in));

	static int nsize;
	static int[][] queen;
	static int nresult=0;
	static int[] result;
	static int tmpy;
	static int tmpx;
	static int movey;
	static int movex;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int cases = Integer.parseInt(stdin.readLine());
	result = new int[cases];
		for (int a = 0; a < cases; a++) {
			nresult=0;
			nsize = Integer.parseInt(stdin.readLine());
			queen=new int[nsize][nsize];
			for (int b = 0; b < nsize; b++) {

				for (int c = 0; c < nsize; c++) {

					queen[b][c] = 0;

				}

			}
			tmpy=0;
			tmpx=0;
		
			
			//queen=makequeen(queen, nsize, tmpy, tmpx);
			
			/*for (int b = 0; b < nsize; b++) {

				for (int c = 0; c < nsize; c++) {

					System.out.print(queen[b][c]+" ");

				}
				System.out.println("");

			}
*/			foo(nsize, 0, 1);
			result[a] = nresult;
			nresult=0;
		}
		for (int a = 0; a < cases; a++) {

			System.out.println(result[a]);
		}
	}
	static int checkUp(int row, int col)
	{
	    int i, r;

	    r = row-1;
	    System.out.println(r);
	    for(i=r; i>=0; i--)
	    {
	    	System.out.println("check");
	        if (queen[i][col] == 1) return 0;
	    }
	    return 1;
	}

	static int checkUL(int row, int col)
	{
	    int r, c;

	    r = row-1; c = col-1;

	    while (true)
	    {
	        if (r < 0 || c < 0) break;

	        if (queen[r][c] == 1) return 0;

	        r--; c--;
	    }

	    return 1;
	}

	static int checkUR(int row, int col, int size)
	{
	    int r, c;

	    r = row-1; c = col+1;

	    while (true)
	    {
	        if (r < 0 || c >= size) break;

	        if (queen[r][c] == 1) return 0;

	        r--; c++;
	    }

	    return 1;
	}
	static void foo(int size, int rowId, int depth)
	{
	    int i, j;

	    // printBoard(board, size); 

	    for (i = 0; i < size; i++)
	    {
	        if (queen[rowId][i] == 0)
	        {
	            if (checkUp(rowId, i)==1 && checkUL(rowId, i)==1 && checkUR(rowId, i, size)==1)
	            {
	                if (depth == size) {
	                    nresult++;
	                    return;
	                }

	                queen[rowId][i] = 1;
	                foo(size, rowId+1, depth+1);
	                queen[rowId][i] = 0;
	            }
	        }
	    }
	}
}
