package 문자열압축;

import java.util.Scanner;

public class Main {
	
	public String solution(String str) {
		
		String answer = "";
		str= str+" ";
		
		int count  = 1;
		
		for(int i = 0; i<str.length()-1; i++) {
			
			if(str.charAt(i) == str.charAt(i+1)) count++;
			else {
				answer+=str.charAt(i);
				if(count>1) answer+=Integer.toString(count);
				count = 1;
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		
		System.out.println(T.solution(str));

	}

}
