package 학급회장;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	static char solution(int num, String str) {
		
		char answer= ' ';
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char key : str.toCharArray()) {
			map.put(key, map.getOrDefault(key, 0)+1);
			
		}
		int max = Integer.MIN_VALUE;
		
		for(char key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		
		
		
		
		
		return answer;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		String str = in.next();
		
		System.out.println(solution(num, str));
		

	}

}
