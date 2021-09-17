package Sort;

public class CountingSort {

	public static void main(String[] args) {
		int[] nums = {2, 3, 5, 7, 2, 4, 5, 6, 7, 3};
		int k = 7;  // [0-7]
		
		System.out.println("Before Sorting");
		display(nums);
		
		//Implement CountingSort
		int[] res = sort(nums, k);
		
		System.out.println("After Sorting");
		display(res);
	}
	
	public static void display(int[] nums) {
		for(int n:nums) {
			System.out.print(n + " ");
		}
		System.out.print("\n");
	}
	
	public static int[] sort(int[] a, int k) {
		int[] cnt = new int[k+1];
		int[] res = new int[a.length];
		
		// Counting occurrences of elements
		for(int x:a) {
			cnt[x]++;
		}
		
		// Calculating the right index of those elements
		// --- for reverse order reverse it into opposite direction
		for(int i=1; i<=k; i++) {
			cnt[i] += cnt[i-1];
		}
		
		// Setting up the position of each element to its right position
		// --- the reason we move from back is to maintain the same order of elements
		// --- as in the given array when they are repeating. (Making it stable)
		for(int i=a.length-1; i>=0; i--) {  
			res[cnt[a[i]]-1] = a[i];
			cnt[a[i]] -= 1;
		}
		
		return res;
	}
}
