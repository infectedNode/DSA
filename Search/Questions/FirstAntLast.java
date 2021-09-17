package Search.Questions;

import java.util.Arrays;

public class FirstAntLast {

	public static void main(String[] args) {

		int[] nums = {5,7,7,8,8,10};
		int t = 8;
//		System.out.println(Arrays.toString(searchRange(nums, t)));
		System.out.println(Arrays.toString(searchRange2(nums, t)));

	}
	
	public static int[] searchRange2(int[] nums, int target) {
		int s=0;
        int e=nums.length-1;
        
        int[] res = {-1, -1};
        
        while(s<=e) {
        	int m = s + (e - s) / 2;
        	if(target <= nums[m]) e = m-1;
        	else s = m+1;
        }
        if(s < nums.length) {
        	if(nums[s] == target) res[0] = s;        	
        }
        
        s=0;
        e=nums.length-1;
        
        while(s<=e) {
        	int m = s + (e - s) / 2;
        	if(target >= nums[m]) s = m+1;
        	else e = m-1;
        }
        if(e >= 0) {
        	if(nums[e] == target) res[1] = e;        	
        }
        
        return res;
	}
	
	public static int[] searchRange(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        
        int[] res = {-1, -1};
        
        binary(nums, s, e, res, target);
        
        return res;
    }
	
	public static void binary(int[] a, int s, int e, int[] res, int t) {
		if(s > e) return;
		
		int c = s+((e-s)/2);
        if(t == a[c]) {
            if(res[0] == -1 && res[1] == -1) {
                res[0] = c;
                res[1] = c;
            } else if(c < res[0]) {
                res[0] = c;
            } else if(c > res[1]) {
                res[1] = c;
            }
            binary(a, s, c-1, res, t);
            binary(a, c+1, e, res, t);
        } else if(t < a[c]) {
        	binary(a, s, c-1, res, t);
        } else {
        	binary(a, c+1, e, res, t);
        }
	}
}
