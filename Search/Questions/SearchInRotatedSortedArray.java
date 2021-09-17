package Search.Questions;

public class SearchInRotatedSortedArray {
	public static void main(String[] args) {
		int[] nums = { 3,4,5,6,7,7,7,7,7,7,0,1,2};
		int t = 7;

		System.out.println(sol(nums, t));
	}

	public static int sol(int[] a, int t) {
		int p = peak(a);
		int idx = binary(a, t, 0, p);
		if(idx == -1) {
			idx = binary(a, t, p+1, a.length-1);
		}
		return idx;
	}
	
	public static int peak(int[] a) {
		int s=0; 
		int e=a.length-2;
		while (s <= e) {
			int m = s + (e - s) / 2;
			if(a[m] > a[m+1]) return m;
			else if(a[m] < a[0]) e = m-1;
			else s = m+1;
		}
		return a.length-1;
	}

	public static int binary(int[] a, int t, int s, int e) {
		while (s <= e) {
			int m = s + (e - s) / 2;
			if(t == a[m]) return m;
			else if(t < a[m]) e = m-1;
			else s = m+1;
		}
		return -1;
	}
}
