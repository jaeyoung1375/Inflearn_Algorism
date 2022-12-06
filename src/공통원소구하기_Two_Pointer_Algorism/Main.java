package 공통원소구하기_Two_Pointer_Algorism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	static ArrayList<Integer> solution(int A, int B, int[] Arr, int[] Brr){
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		Arrays.sort(Arr);
		Arrays.sort(Brr);
		
		int p1 = 0;
		int p2 = 0;
		
		while(p1 < A && p2 < B) {
			if(Arr[p1] == Brr[p2]) {
				answer.add(Arr[p1]);
				p1++;
				p2++;
			}else if(Arr[p1] < Brr[p2]) {
				p1++;
			}else {
				p2++;
			}
		}
		
		
		
		
		
		
		return answer;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int[] Arr = new int[A];
		for(int i = 0; i<A; i++) {
			Arr[i] = in.nextInt();
		}
		
		int B = in.nextInt();
		int[] Brr = new int[B];
		for(int i = 0; i<B; i++) {
			Brr[i] = in.nextInt();
		}
		
		for(int x : solution(A, B, Arr, Brr)) {
			System.out.print(x+" ");
		}
		
	
	
		
	

	}

}
