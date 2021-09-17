package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HowManyNumbersAreSmallerThantheCurrentNumber {
	public static void main(String args[]) {
		int[] nums = {8,1,2,2,3};
		System.out.println(Arrays.toString(sol(nums)));
	}
	
	public static int[] sol(int[] nums) {
		List<Integer> list = new ArrayList<>();
		
		for(int n : nums) {
			list.add(n);
		}
		
		Collections.sort(list);
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=list.size()-1; i>=0; i--) {
			map.put(list.get(i), i);
		}
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = map.get(nums[i]);
		}
		return nums;
	}
}
