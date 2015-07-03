package freshlevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HAMMINGCODE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int[][] arr = new int[cases][7];
		
		for (int i = 0; i < cases; i++) {

			String numb = sc.next();
			
			for (int a = 0; a < 7; a++) {
				String temp = numb.substring(a, a + 1);
				arr[i][a] = Integer.parseInt(temp);
			}
			int first = XOR(Arrays.asList(arr[i][0], arr[i][2], arr[i][4],
					arr[i][6]));
			int second = XOR(Arrays.asList(arr[i][1], arr[i][2], arr[i][5],
					arr[i][6]));
			int third = XOR(Arrays.asList(arr[i][3], arr[i][4], arr[i][5],
					arr[i][6]));
			int searcherror = first + (second * 2) + (third * 4) - 1;
			
			if (searcherror != -1) {
				if (arr[i][searcherror]==1) {
					arr[i][searcherror] = 0;
				
				}else if(arr[i][searcherror]==0){
					arr[i][searcherror] = 1;
					
				}else{
					System.out.println("error!!");
				}

			}
		}
		sc.close();
		for(int i=0;i<cases;i++){
			System.out.println(""+arr[i][2]+ arr[i][4]+ arr[i][5]+
					arr[i][6]);
		}

	}

	public static int XOR(List<Integer> insert) {
		int xresult = 0;
		for (int i = 0; i < 4; i++) {
			xresult += insert.get(i);

		}
		if (xresult % 2 == 0) {
			xresult = 0;
		} else {
			xresult = 1;
		}
		
		return xresult;
	}
}
