package Search;

public class BinarySearch {
	public static void main(String[] args) {
		int[] nums = {2,4,6,7,9,13,15,20,40,67};
		int t = 16;
		
		System.out.println(sol(nums, t));
	}
	
	public static int sol(int[] a, int t) {
		
		int s = 0;
		int e = a.length-1;
		
		while(s <= e) {
			int m = s + (e - s) /2;
			if(a[m] == t) return m;
			else if(t < a[m]) e = m-1;
			else s = m+1;
		}
		return -1;
	}
}
