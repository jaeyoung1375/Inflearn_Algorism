package 중복문자제거;

import java.util.Scanner;

public class Main {
	
	public String Solution(String str) {
		
		String answer="";
		
		for(int i = 0; i<str.length(); i++) {
			//System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
			
			if(str.indexOf(str.charAt(i)) ==i) answer+=str.charAt(i);
		
		}
		
	
		
		
		return answer;
	}

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		Main T = new Main();
		
		String str = in.next();
		
		System.out.println(T.Solution(str));

		
	}

}
