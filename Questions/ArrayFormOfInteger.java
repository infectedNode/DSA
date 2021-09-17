package Questions;

import java.util.LinkedList;
import java.util.List;

public class ArrayFormOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
//		[1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3]
//				516
		int k = 1;

		System.out.println(nums.length);
		System.out.println(addToArrayForm(nums, k));
	}

	public static List<Integer> addToArrayForm(int[] num, int k) {
		List<Integer> list = new LinkedList<>();
		int carry = 0;
		for (int i = num.length - 1; i >= 0; i--) {
			int innersum = num[i] + (k % 10) + carry;
			list.add(0, innersum % 10);
			carry = innersum / 10;
			k /= 10;
		}
		while (k > 0) {
			int innersum = (k % 10) + carry;
			list.add(0, innersum % 10);
			carry = innersum / 10;
			k /= 10;
		}

		if (carry > 0) {
			list.add(0, carry);
		}

		return list;
	}

}

class Solution {
	public List<Integer> addToArrayForm(int[] num, int k) {
		List<Integer> list = new LinkedList<>();
		int carry = 0;
		for (int i = num.length - 1; i >= 0; i--) {
			int innersum = num[i] + (k % 10) + carry;
			list.add(0, innersum % 10);
			carry = innersum / 10;
			k /= 10;
		}
		while (k > 0) {
			int innersum = (k % 10) + carry;
			list.add(0, innersum % 10);
			carry = innersum / 10;
			k /= 10;
		}

		if (carry > 0) {
			list.add(0, carry);
		}

		return list;
	}
}
