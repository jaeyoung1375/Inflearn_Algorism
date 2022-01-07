package 팰린드롬;

import java.util.Scanner;

public class Main {
	
	public String solution(String str) {
		
		String answer = "NO";
		str = str.toUpperCase().replaceAll("[^A-Z]",""); // A~Z가 아니면
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) answer="YES";
		
		
		
		
		return answer;
	}

	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(T.solution(str));
		
	

	}

}
