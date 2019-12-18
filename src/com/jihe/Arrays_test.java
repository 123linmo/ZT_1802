package com.jihe;

import java.util.Arrays;

public class Arrays_test {

	public static void main(String[] args) {
		int[]arr= {3,6,2,8,3,8};
		System.out.println("排序前:");
		printArray(arr);
		Arrays.sort(arr);
		System.out.println("\n排序后:");
		printArray(arr);
		
		int index=Arrays.binarySearch(arr, 6);
		System.out.println("元素6的索引是:"+index);
		
		//拷贝数组元素
		int [] copiedArr=Arrays.copyOfRange(arr, 2, 8);
		System.out.println("\n被拷贝的数组是:");
		printArray(copiedArr);
		//替换数组元素
		Arrays.fill(copiedArr, 8);
		System.out.println("\n被拷贝的数组元素替换成8以后是:");
		printArray(copiedArr);
	}

	private static void printArray(int[] arr) {
		System.out.print("[");
		for(int x=0;x<arr.length;x++) {
			if(x !=arr.length -1) {
				System.out.print(arr[x] +",");
			}else {
				System.out.println(arr[x]+"]");
			}
		}
		
	}

}
