package com.chuba.training.arrays;

import java.util.*;
//array = [5, 1, 22, 25, 6, -1, 8, 10] len 8
//sequence = [1, 6, -1, 10] len 4

public class Subsequence1 {

	// O(n) time | O(1) space - where n is the length of the array
	public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		int arrIdx = 0;
		int seqIdx = 0;

		while (arrIdx < array.size() && seqIdx < sequence.size()) {
			if (array.get(arrIdx).equals(sequence.get(seqIdx))) {
				System.out.println(sequence.get(seqIdx));
				System.out.println("is equal");
				seqIdx++;
			}
			else {
				System.out.println("is not equal");
			}
			arrIdx++;
		}
		System.out.println("This is the last index in the sequence " +seqIdx);
		System.out.println("This is the sequence size " +sequence.size());
		
		return seqIdx == sequence.size();
	}

}
