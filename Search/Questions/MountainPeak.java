package Search.Questions;

public class MountainPeak {
	public static void main(String[] args) {
		int[] nums = { 2, 4, 6, 7, 100, 99, 5, 0};

		System.out.println(sol(nums));
	}

	public static int sol(int[] a) {
		int s = 0;
		int e = a.length-1;

		while (s <= e) {
			int m = s + (e - s) / 2;
			if (a[m]>a[m-1] && a[m]>a[m+1]) return a[m];
			else if (a[m] < a[m+1]) e = m - 1;
			else s = m + 1;
		} 
		
		return -1;
	}
}
