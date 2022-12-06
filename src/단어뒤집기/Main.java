package 단어뒤집기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public ArrayList<String> solution(int num, String[] str) {
		
		ArrayList<String> answer = new ArrayList<String>();
		
//		for(String x : str) {
//			String tmp = new StringBuilder(x).reverse().toString();
//			answer.add(tmp);
//		}
		
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt =0, rt = x.length()-1;
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
		
		
		
		
		return answer;
	}

	public static void main(String[] args) {

		Main T = new Main();
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		String[] str = new String[num];
		
		for(int i = 0; i<num; i++) {
			str[i] = in.next();
		}
		
		for(String x : T.solution(num, str)) {
			System.out.println(x);
		}
		
	
		
		
		

		
	}

}
