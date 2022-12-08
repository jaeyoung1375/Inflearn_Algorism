package 연속된자연수의합_Two_Point;

import java.util.Scanner;

public class Main {
	
	static int solution(int N) {
		
		int answer = 0;
		int lt = 0, rt= 0;
		int sum = 0;
		
		for(rt = 1; rt<=N/2+1; rt++) {
			sum+=rt;
			if(sum == N) answer++;
			while(sum >N) {
				sum -= lt++;
				if(sum == N) answer++;
			}
			
			
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		System.out.println(solution(N));

	}

}
