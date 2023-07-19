package sample;

import java.util.Scanner;

public class rotation {
	public static void ReverseArray(int start , int end , int arr[]) {
		int i = start;
		int j = end;
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		
		 ReverseArray(0,arr.length-1,arr);
		 ReverseArray(0,k-1,arr);
		 ReverseArray(k,arr.length-1,arr);
		 
		System.out.print("[");
		for(int i=0;i<n;i++) {
		
		System.out.print(arr[i]+", ");
		}
		System.out.println("]");

}
}
