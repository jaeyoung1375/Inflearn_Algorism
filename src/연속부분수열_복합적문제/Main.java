package 연속부분수열_복합적문제;

import java.util.Scanner;

public class Main {
	
	static int solution(int N, int M, int[] arr) {
		
		int answer = 0, sum = 0, lt=0;
		for(int rt = 0; rt<N; rt++) {
			sum+=arr[rt];
			if(sum == M) answer++;
			while(sum >= M) {
				sum -= arr[lt++];
				if(sum == M) answer++;
			}	
		}
		
		
		 
		
		return answer;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		
		int[] arr = new int[N];
		
		for(int i = 0; i<N; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.println(solution(N, M, arr));

	}

}
