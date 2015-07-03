package freshlevel;

import java.util.ArrayList;
import java.util.Scanner;

public class URI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int count=0;
		String check="";
		ArrayList<String> pArrayList = new ArrayList<String>();
		for (int i = 0; i < cases; i++) {
			
			String word = sc.next();
			String word2=select(word);
			if(check(word2)>0){
				for(int a=0;a<check(word2);a++){
					select(word2);
				}
			}
		    		pArrayList.add(word2);
	}
		for (int p = 0; p < cases; p++) {
			System.out.println(pArrayList.get(p));
		}
	}
	
	public static int check(String word){
		int cnt=0;
		String [] proto = new String[word.length()];
		for(int i=0;i<proto.length;i++){
			for(int k=0;k<word.length();k++){
				proto[k]=word.substring(k, k+1);
			}
			if(proto[i].equals("%")){
				String qu = proto[i]+proto[i+1]+proto[i+2];
				if(qu.equals("%20")){
					cnt=cnt+1;
				}else if(qu.equals("%21")){
					cnt=cnt+1;
				}
				else if(qu.equals("%24")){
					cnt=cnt+1;
				}
				else if(qu.equals("%25")){
					cnt=cnt+1;
				}
				else if(qu.equals("%28")){
					cnt=cnt+1;
				}
				else if(qu.equals("%29")){
					cnt=cnt+1;
				}
				else if(qu.equals("%2a")){
					cnt=cnt+1;
				}
				
			}
		
		}
		
		
		return cnt;
	}
		public static String select(String word){
			ArrayList<String> rArrayList = new ArrayList<String>();
			ArrayList<String> kArrayList = new ArrayList<String>();
			int count=0;
				
			String[] text = new String[80];
			for (int a = 0; a < word.length(); a++) {

				text[a] = word.substring(a, a + 1);
				

			}

			for (int a = 0; a < word.length(); a++) {
				
				if (text[a].equals("%")) {
					String temp = text[a] + text[a + 1] + text[a + 2];

					if (temp.equals("%20")) {
						String result = " ";
						text[a] = result;
						text[a + 1] = "";
						text[a + 2] = "";
						String input = "";
						count=count+1;
						for (int b = 0; b < word.length(); b++) {

							input += text[b];

						}
						rArrayList.add(input);
						input = "";
					} else if (temp.equals("%21")) {
						String result = "!";
						text[a] = result;
						text[a + 1] = "";
						text[a + 2] = "";
						String input = "";
						count=count+1;
						for (int b = 0; b < word.length(); b++) {

							input += text[b];

						}
						rArrayList.add(input);
						input = "";
					} else if (temp.equals("%24")) {
						String result = "$";
						text[a] = result;
						text[a + 1] = "";
						text[a + 2] = "";
						String input = "";
						count=count+1;
						for (int b = 0; b < word.length(); b++) {

							input += text[b];

						}
						rArrayList.add(input);
						input = "";

					} else if (temp.equals("%25")) {
						String result = "%";
						text[a] = result;
						text[a + 1] = "";
						text[a + 2] = "";
						String input = "";
						count=count+1;
						for (int b = 0; b < word.length(); b++) {

							input += text[b];

						}

						rArrayList.add(input);
						input = "";
					} else if (temp.equals("%28")) {
						String result = "(";
						text[a] = result;
						text[a + 1] = "";
						text[a + 2] = "";
						String input = "";
						count=count+1;
						for (int b = 0; b < word.length(); b++) {
							
							input += text[b];
						}
						rArrayList.add(input);
						input = "";

					} else if (temp.equals("%29")) {
						String result = ")";
						text[a] = result;
						text[a + 1] = "";
						text[a + 2] = "";
						String input="";
						count=count+1;
						for (int b = 0; b < word.length(); b++) {
							
							input += text[b];
							
						}
						rArrayList.add(input);
						input = "";
					} else if (temp.equals("%2a")) {
						String result = "*";
						text[a] = result;
						text[a + 1] = "";
						text[a + 2] = "";
						String input = "";
						count=count+1;
						for (int b = 0; b < word.length(); b++) {
							
							input += text[b];
							
						}
						rArrayList.add(input);
						input = "";

					}
				}

			
			}
			if(count==0){
			return word;
			}else{
			
			return word=rArrayList.get(count-1);
			}
		}

		
	}

