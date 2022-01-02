package 문장속단어;

import java.util.Scanner;

public class Main {
	
	public String Solution(String str) {
		
		String answer="";
		
		int max = Integer.MIN_VALUE,pos;
		
//		String[] s = str.split(" ");
//		for(String x : s) {
//			
//			int len = x.length();
//			if(len>max) {
//				max=len;
//				answer=x;
//			}
//		
//			
//		}
		
		while((pos = str.indexOf(' '))!=-1) {
			
			String tmp = str.substring(0,pos);
			int len = tmp.length();
			if(len > max) {
				max=len;
				answer=tmp;
			}
			str = str.substring(pos+1);
		}
		if(str.length()>max) answer=str;
		
		
		
		
		return answer;
	}

	public static void main(String[] args) {

		Main T = new Main();
		
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		
		System.out.println(T.Solution(str));
	}

}
