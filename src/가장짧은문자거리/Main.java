package 가장짧은문자거리;

import java.util.Scanner;

public class Main {
	
	public int[] solution(String str, char t) {
		
		int[] answer = new int[str.length()];
		int p = 1000;
		
		for(int i = 0; i<str.length(); i++) {
			
			if(str.charAt(i) == t) {
				p = 0;
				answer[i] = p;
			}else {
				p++;
				answer[i] = p;
			}
		}
		
		for(int i = str.length()-1; i>=0; i--) {
			
			if(str.charAt(i) == t) {
				p = 0;
				answer[i] = p;
			}else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		char t = in.next().charAt(0);
		
		for(int x : T.solution(str, t)) {
			System.out.printf(x+" ");
		}
		
		

	}

}
