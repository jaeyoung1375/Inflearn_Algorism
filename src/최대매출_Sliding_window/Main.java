package 최대매출_Sliding_window;

import java.util.Scanner;

public class Main {
	
	static int solution(int N, int K, int[] arr) {
		
		int answer = 0, sum = 0;
		
		for(int i = 0; i<K; i++) sum += arr[i];
		answer = sum;
		
		
		for(int i =K; i<arr.length; i++) {
				sum+=(arr[i]-arr[i-K]);
				answer= Math.max(answer, sum);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int K = in.nextInt();
		
		int[] arr = new int[N];
		
		for(int i = 0; i<N; i++) {
			arr[i] = in.nextInt();
		}

		System.out.println(solution(N, K, arr));
	}
	


}
