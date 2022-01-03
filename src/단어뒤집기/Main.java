package 단어뒤집기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public ArrayList<String> Solution(int n, String[] str) {
		
		ArrayList<String> answer = new ArrayList<>();
		
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt = 0, rt =x.length()-1;
			while(lt<rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);
			answer.add(tmp);
		}
		
//		for(String x : str) {
//			String tmp = new StringBuilder(x).reverse().toString();
//			answer.add(tmp);
//		}
		
		
		return answer;
		
		
	}

	public static void main(String[] args) {
		
		Main T = new Main();
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		String[] str = new String[N];
		
		for(int i = 0; i<N; i++) {
			
			str[i] = in.next();
			
		}
		
		for(String x : T.Solution(N, str)) {
			System.out.println(x);
		}
		
		
		
		
		
		
	}

}