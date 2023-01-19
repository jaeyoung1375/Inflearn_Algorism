package 아나그램;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
	
	static String solution(String str, String str2) {
		
		String answer = "YES";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		
		for(char x : str.toCharArray()) {
			
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
	
		for(char x : str2.toCharArray()) {
			if(!map.containsKey(x) || map.get(x) == 0) return "NO";
			map.put(x, map.get(x)-1);
			
		}
		
	
		
		
		
		
		return answer;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		String str2 = in.next();
		
		System.out.println(solution(str, str2));
		
		

	}

}
