package edu.smith.cs.csc212.sorting;

import me.jjfoley.adt.ListADT;

public class SelectionSorts {
	public static void sort(ListADT<Integer> input) {
		int S = input.size();
		for (int i = 0; i < S - 1; i++) {
			int small = i;
			for (int big = i + 1; big < small; big++) {
				if (input.getIndex(big) < input.getIndex(small)) {
					small = big;
					
					int swap = small;
					small = i;
					i = swap;
				}

			}
		}

	}
}
