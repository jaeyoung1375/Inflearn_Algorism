package 특정문자뒤집기;


import java.util.Scanner;

public class Main {
	
	public String Solution(String str) {
		
		String answer;
		
		char[] c = str.toCharArray();
		
		int lt = 0, rt = str.length()-1;
		
		
		while(lt<rt) {
			
			if(!Character.isAlphabetic(c[lt])) lt++;
			else if(!Character.isAlphabetic(c[rt])) rt--;
			else {
			
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;
				lt++;
				rt--;
			}
			
			
		}
		answer = String.valueOf(c);
		
		return answer;
		
	
	}

	public static void main(String[] args) {

		Main T = new Main();
		
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		
		System.out.println(T.Solution(str));
	}

}
