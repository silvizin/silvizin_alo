package freshlevel;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class FIXPAREN {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		ArrayList<String> result = new ArrayList<>();
		int cases = sc.nextInt();
		for (int i = 0; i < cases; i++) {
			String leftword = sc.next();
			String rightword = sc.next();
			if (rightword.length() == 4) {

				result.add(i, operate(leftword,rightword));
							
				
				
			}
			
		}

		for (int i = 0; i < result.size(); i++) {

			System.out.println(result.get(i));
		}

	}

	public static String operate(String leftword,String rightword) {
		Character[] result=new Character [leftword.length()];
		Stack<Character> rightst = new Stack<>();
		Stack<Character> counterst = new Stack<>();
		Stack<Character> st = new Stack<>();
		Stack<Integer> wherest = new Stack<>();  //변경해야 할 글자의 위치를 담아내는 stack
		wherest.clear();
	
		int cnt=0;
		rightst.clear();
		st.clear();
		counterst.clear();
		for(int i=0;i<rightword.length();i++){
			
			rightst.push(rightword.charAt(i));
			if(rightst.get(i).equals('<')){
				counterst.push('>');
			}else if(rightst.get(i).equals('(')){
				counterst.push(')');
			}else if(rightst.get(i).equals('{')){
				counterst.push('}');
			}else if(rightst.get(i).equals('[')){
				counterst.push(']');
			} 
		}
		
		for(int i=0;i<leftword.length();i++){
			Character c = leftword.charAt(i);
		
			if(c.equals('(') || c.equals('[') || c.equals('{')|| c.equals('<')){
				st.push(c);
				result[i]=c;
				
				cnt++;
				
				wherest.push(i);
			}else{
				if(st.empty()){
					return"뭔가 잘못된거야";
				}
				Character tmp = st.peek();
				if(tmp.equals('{')&&c.equals('}')){
					result[i]=c;
					st.pop();
					cnt--;
					wherest.pop();
				}else if(tmp.equals('(')&&c.equals(')')){
					cnt--;
					result[i]=c;
					st.pop();
					wherest.pop();
				}else if(tmp.equals('[')&&c.equals(']')){
					cnt--;
					result[i]=c;
					st.pop();
					wherest.pop();
				}else if(tmp.equals('<')&&c.equals('>')){
					cnt--;
					result[i]=c;
					st.pop();
					wherest.pop();
				}else{
					
					int a=counterst.indexOf(c); 
					int b=rightst.indexOf(tmp);
				
					if(a!=b){
						
						if(a>b){
							
							if(cnt>2){
								result[wherest.peek()]=tmp;
							
								result[i]=counterst.get(b);
							}else{
								result[wherest.peek()]=tmp;
								result[i]=counterst.get(b);
								
							}
							
							st.pop();
							wherest.pop();
						}else if(b>a){
							
							
								result[wherest.peek()]=rightst.get(a);
							
								result[i]=c;
								cnt++;
							
							
							st.pop();
							wherest.pop();
						}
						
					
					}
					
					
					
				}
			}
		}
		String sresult="";
		for(int i=0;i<leftword.length();i++){
			sresult+=result[i];
		}
		
		return sresult;
	}
}
