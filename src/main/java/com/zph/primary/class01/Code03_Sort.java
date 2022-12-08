package com.zph.primary.class01;

public class Code03_Sort {

	/**
	 * 交换位置
	 */
	public static void swap(int[] arr, int i, int j) {
		int tmp = arr[j];
		arr[j] = arr[i];
		arr[i] = tmp;
	}

	/**
	 * 选择排序
	 */
	public static void selectSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		int N = arr.length;
		// 0 ~ n-1
		// 1 ~ n-1
		// 2 ~ n-1
		for (int i = 0; i < N; i++) {
			// i ~ n-1
			// 最小值下标的索引
			int minValueIndex = i;
			for (int j = i + 1; j < N; j++) {
				minValueIndex = arr[j] < arr[minValueIndex] ? j : minValueIndex;
			}
			swap(arr, i, minValueIndex);
		}
	}

	/**
	 * 冒泡排序
	 */
	public static void bubbleSort(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		// 0 ~ n-1
		// 0 ~ n-2
		// 0 ~ n-3
		int N = arr.length;
		for (int end = N-1; end >=0; end--) {

			// 0 ~ end
			// 0 ~ 1  1 ~ 2 2 ~ 3 ...  end-1 ~ end
			for (int second = 1; second <= end; second++) {
				if (arr[second-1] > arr[second]) {
					swap(arr,second- 1, second);
				}
			}

		}
	}

	/**
	 * 插入排序
	 */
	public static void insertSort1(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		int N = arr.length;
		// 0 ~ 0 完成
		// 0 ~ 1 有序
		// 0 ~ 2 有序
		// 0 ~ 3 ...
		// 0 ~ n-1
		for (int end = 1; end < N; end++) {
			int newNumIndex = end;
			// 左边有数 左边还比右边大
			while (newNumIndex - 1 >= 0 && arr[newNumIndex - 1] > arr[newNumIndex]) {
				// 交换
				swap(arr, newNumIndex - 1, newNumIndex);
				// 前移
				newNumIndex--;
			}
		}
	}

	public static void insertSort2(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		int N = arr.length;
		for (int end = 1; end < N; end++) {
			// pre 新数的前一个位置
			for (int pre = end - 1; pre >= 0 && arr[pre] > arr[pre + 1]; pre--) {
				swap(arr, pre, pre + 1);
			}
		}
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 7, 1, 3, 5, 1, 6, 8, 1, 3, 5, 7, 5, 6 };
		printArray(arr);
		insertSort1(arr);
		printArray(arr);
	}

}
