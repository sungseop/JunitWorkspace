package com.ezen.unit;

public class MathUtil {
	
	// 배열의 항목 중 가장 큰 수를 찾는 메소드
	public static int findMax(int arr[]) {
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}