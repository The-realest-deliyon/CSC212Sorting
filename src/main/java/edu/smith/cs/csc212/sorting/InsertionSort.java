package edu.smith.cs.csc212.sorting;

import me.jjfoley.adt.ListADT;

public class InsertionSort {
 public static void sort(ListADT<Integer> input) {
	 int S = input.size();
	 for( int i = 1; i < S; i++) {
		 int key = input.getIndex(i);
		 int minus = i - 1;
		 while(minus >= 0 && input.getIndex(minus)> key) {
			 input.swap(i, i-1);
			 minus = minus - 1;
		 }
	 }
 }
}
