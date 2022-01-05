package 회문문자열;


import java.util.Scanner;

public class Main {
	
	public String Solution(String str) {
		
//		String answer="Yes";
//		str = str.toUpperCase();
//		
//		
//		
//		int len = str.length();
//		for(int i =0; i<len/2; i++) {
//			
//			if(str.charAt(i) != str.charAt(str.length()-i-1)) return "No";
//		}
//		
//		
		
		String answer="NO";
		String tmp = new StringBuilder(str).reverse().toString();
		
		if(str.equalsIgnoreCase(tmp)) return "YES";
		
		
		
		return answer;
		
	}

	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		
		System.out.println(T.Solution(str));
		
		

	}

}
