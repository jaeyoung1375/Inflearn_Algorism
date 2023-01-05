package 버블정렬;

import java.util.Scanner;

public class Solution {
	
	static int[] solution(int num, int[] arr) {
		
		int[] answer = new int[num];
		
		for(int i = 0; i<num -1; i++) {
			for(int j = num-1; j>i; j--) {
				if(arr[j-1] > arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				}
				
			}
		}
		
		answer = arr;
		
		return answer;
	
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
				
		int num = in.nextInt();

		int[] arr = new int[num];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = in.nextInt();
		}
		
		for(int x : solution(num, arr)) {
			System.out.print(x+" ");
		}
		
	}

}
