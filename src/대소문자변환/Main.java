package 대소문자변환;

import java.util.Scanner;

public class Main {
	
	public String solution(String str) {
		
		String answer = "";
		
		for(char x : str.toCharArray()) {
			
//			if(x >='a' && x<='z') {
//				answer+=Character.toUpperCase(x);
//			}else {
//				answer+=Character.toLowerCase(x);
//			}
//		}
			
			if(Character.isLowerCase(x)) answer+= Character.toUpperCase(x);
			else answer+=Character.toLowerCase(x);
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
