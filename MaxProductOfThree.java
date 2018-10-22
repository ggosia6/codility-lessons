/*
 * Task: MaxProductOfThree
 * Source: codility.com - Lesson 06 - https://app.codility.com/programmers/lessons/6-sorting/max_product_of_three/
 * Maximize A[P] * A[Q] * A[R] for any triplet (P, Q, R).
 */

import java.util.*;

class Solution {

	public int solution(int[] A) {

		if (A.length == 3) {
			return A[0] * A[1] * A[2];
		}

		List<Integer> plus = new ArrayList<>();
		List<Integer> minus = new ArrayList<>();
		List<Integer> zeros = new ArrayList<>();

		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				zeros.add(A[i]);
			} else if (A[i] > 0) {
				plus.add(A[i]);
			} else {
				minus.add(A[i]);
			}
		}

		// Sort numbers above zero in descending order
		Collections.sort(plus);
		Collections.reverse(plus);

		// Sort number below zero in ascending order
		Collections.sort(minus);

		int plusProduct = 0;
		int minusProduct = 0;
		
		// If we have 3 plus numbers count their product
		if (plus.size() >= 3) {
			plusProduct = plus.get(0) * plus.get(1) * plus.get(2);
		}
		// If we have more than two minus numbers and one plus number count their
		// product
		if (minus.size() >= 2 && !plus.isEmpty()) {
			minusProduct = minus.get(0) * minus.get(1) * plus.get(0);
		}
		// no number above zero number
		if (plus.isEmpty()) {
			
			// 1) check zeros
			if (!zeros.isEmpty()){
				return 0;
			// 2) when no zeros get product of three largest minus numbers
			} else {				
				Collections.reverse(minus);
				return minus.get(0) * minus.get(1) * minus.get(2);
			}
		} else {
			return Math.max(plusProduct, minusProduct);
		}
	}

}
