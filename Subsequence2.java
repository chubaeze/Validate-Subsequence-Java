package com.chuba.training.arrays;
//array = [5, 1, 22, 25, 6, -1, 8, 10] len 8
//sequence = [1, 6, -1, 10] len 4
import java.util.*;

public class Subsequence2 {
	public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
	    int seqIdx = 0;
	    
	    for (var value : array) {
	      if (seqIdx == sequence.size()) {
	        break;
	      }
	      else if (sequence.get(seqIdx).equals(value)) {
	        seqIdx++;
	      }
	    }
	    return seqIdx == sequence.size();
	  }

}
