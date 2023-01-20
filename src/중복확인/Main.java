package 중복확인;



import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	static String solution(int num, int[] arr) {
		
		String answer = "U";
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i<arr.length; i++) {
			set.add(arr[i]);
		}
		
		if(set.size() != arr.length) answer ="D";
		
		return answer;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.println(solution(num, arr));
		
		

	}

}
