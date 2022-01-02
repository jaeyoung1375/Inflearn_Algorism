package 대소문자변환;

import java.util.Scanner;

public class Main {
	
	public String Solution(String str) {
		
		String answer="";
		
		for(char x : str.toCharArray()) {
			
			if(Character.isUpperCase(x)) answer+=Character.toLowerCase(x);
			else answer+=Character.toUpperCase(x);
		}
		
		
		
		
		return answer;
	}

	public static void main(String[] args) {

		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		System.out.println(T.Solution(str));
	}

}
