package freshlevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CSBASEBALL {

	static BufferedReader stdin = new BufferedReader(new InputStreamReader(
			System.in));
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int cases= Integer.parseInt(stdin.readLine());
		ArrayList<Integer> result = new ArrayList<>();
		for(int c=0;c<cases;c++){
			
			String[] read = stdin.readLine().split(" ");
			int cs = Integer.parseInt(read[0]);
			int pin = Integer.parseInt(read[1]);
			
			
			result.add(anta(cs,pin));
			
		}
		for(int c=0;c<cases;c++){
			System.out.println(result.get(c));
		}
	}
	static int anta(int cs,int pin){
		int antasu=0;
		int chai=pin-cs;
		if(chai<0){
			return antasu;
		}else{
			antasu=4+chai;
			
		}
		
		
		
		return antasu;
	}
}
