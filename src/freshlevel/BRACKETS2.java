package freshlevel;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class BRACKETS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Stack<Character> st = null;

		int cases = sc.nextInt();
		ArrayList<String> iword = new ArrayList<String>();
		ArrayList<Integer> check = new ArrayList<Integer>();
		for (int i = 0; i < cases; i++) {
			String word;
			word = sc.next();
			iword.add(i, operate(word));
			// method input

		}
		
		for(int i=0;i<iword.size();i++){
			System.out.println(iword.get(i));
		}

	}

	public static String operate(String word) {
		
		Stack<Character> st = new Stack<Character>();
		st.clear();
		for (int i = 0; i < word.length(); i++) {
			
			Character c=word.charAt(i);
			
			if (c.equals('(') || c.equals('[') || c.equals('{')) {
				st.push(c);
			}
			else{
				if(st.empty()){
					return "NO";
				}
				Character tmp=st.peek();
				if(tmp.equals('{')&&c.equals('}')){
					st.pop();
				}else if(tmp.equals('(')&&c.equals(')')){
					st.pop();
				}else if(tmp.equals('[')&&c.equals(']')){
					st.pop();
				}
				
			}
		}
		
		if(!st.empty()){
			return "NO";
		}else{
			return "YES";
		}
		
	}
}
