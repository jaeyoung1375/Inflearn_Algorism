package 두배열합치기_Two_Pointer_Algorism;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<Integer> solution(int N, int M, int[] Arr, int[] Brr){
		
		ArrayList<Integer> answer = new ArrayList<>();
		int p1 = 0;
		int p2 = 0;
		
		while(p1 < N && p2 < M) {
			if(Arr[p1] < Brr[p2]) {
				answer.add(Arr[p1++]);
			}
			else {
				answer.add(Brr[p2++]);
			}		
		}
		
		while(p1 < N) answer.add(Arr[p1++]);
		while(p2 < M) answer.add(Brr[p2++]);
		
		
		
		
		
		return answer;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] Arr = new int[N];
		for(int i = 0; i<N; i++) {
			Arr[i] = in.nextInt();
		}
		
		int M = in.nextInt();
		int[] Brr = new int[M];
		for(int i = 0; i<M; i++) {
			Brr[i] = in.nextInt();
		}
		
		for(int x : solution(N, M, Arr, Brr)) {
			System.out.print(x+" ");
		}

	}

}
