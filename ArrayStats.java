package com.aurionpro.test;
import java.util.*;
public class ArrayStats {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[args.length];
		for(int i=0;i<args.length;i++) {
			a[i] = Integer.parseInt(args[i]);
		}
		
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		
		double average = sum/a.length;
		
		int min = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		
		int max = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		
		int freq[] = new int[a.length];
		for(int i=0;i<=a.length-1;i++) {
			int count = 1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count+=1;
					freq[j] = -1;
				}
			}
			if(freq[i]!=-1) {
				freq[i] = count;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			if(freq[i]!=-1) {
				System.out.println(a[i]+" frequency is "+freq[i]);
			}
		}
		
		
		System.out.println(sum);
		System.out.println(average);
		System.out.println(min);
		System.out.println(max);
	}

}
