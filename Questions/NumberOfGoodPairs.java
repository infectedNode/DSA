package Questions;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {

	public static void main(String[] args) {
//		int[] nums = {1,2,3,1,1,3};
		int[] nums = {1,1,1,1};
		System.out.println(sol(nums));
	}
	
	public int numIdenticalPairs(int[] nums) {
        int cnt=0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int n : nums) {
            if(map.get(n) == null) {
                map.put(n, 1);
            } else {
                cnt += map.get(n);
                map.put(n, map.get(n)+1);
            }
        }
        return cnt;
    }
	
	public static int sol(int[] nums) {
		int max=0;
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int n : nums) {
			if(map.get(n) == null) {
				map.put(n, 1);
			} else {
				map.put(n, map.get(n)+1);
				if(map.get(n) > max) max = map.get(n); 
			}
		}
		
		if(max <= 1) {
			return 0;
		}
		
		int[] cnt = new int[max];
		for(int i=1; i<max; i++) {
			cnt[i] += (i+cnt[i-1]);
		}
		
		max=0; 
		
		for(int key : map.keySet()) {
			max += cnt[map.get(key)-1];
		}
		
		return max;
	}

}
