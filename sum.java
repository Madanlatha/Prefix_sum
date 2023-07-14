package PrefixSum;

import java.util.Scanner;

public class sum {
	static int n;
	public static int[] PrefixSum(int arr[]) {
		
		int p[]=new int[n];
		p[0]=arr[0];
		for(int i=1;i<n;i++) {
			p[i]=p[i-1]+arr[i];
		}
		return p;

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int prefix[]=PrefixSum(arr);
		for(int i=0;i<n;i++) {
			System.out.print(prefix[i]);
		}
	

	}

}
