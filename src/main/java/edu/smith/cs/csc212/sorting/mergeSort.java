package edu.smith.cs.csc212.sorting;

import me.jjfoley.adt.ListADT;
import me.jjfoley.adt.impl.JavaList;

public class mergeSort {

	public static ListADT<Integer> recursiveMergeSort(ListADT<Integer> list){
		//find the middle of the list
		int mid;
		
		if(list.size() <= 1) {
			return list;
		}
		//use math.round to get an int rather than a float
		mid = (Math.round(list.size())/ 2);
		ListADT<Integer> ListA = recursiveMergeSort(list.slice(0, mid));
		ListADT<Integer> ListB = recursiveMergeSort(list.slice(mid, list.size()));
		
		return merging (ListA, ListB);
	}

	private static ListADT<Integer> merging(ListADT<Integer> ListA, ListADT<Integer> ListB) {
		//Initialize Variables
		int i = 0;
		int j = 0;
		ListADT<Integer> newSet = new JavaList<>();
		
		while (i < ListA.size() && j < ListB.size()){
			if(ListA.getIndex(i) < ListB.getIndex(j)) {
				i++;
			}else {
				newSet.addBack(ListB.getIndex(j));
				j++;
			}
			
		}if(i == ListA.size()) {
			newSet.addAll(ListB.slice(j, ListB.size()));
		}else {
			newSet.addAll(ListA.slice(j, ListA.size()));
		}
		return newSet;
	}
}
