package Search.Questions;

public class InfiniteArrayBinarySearch {
	public static void main(String[] args) {
		int[] nums = { 2, 4, 6, 7, 9, 13, 15, 20, 40, 67, 68, 69, 70, 71, 72, 73, 99};
		int t = 99;

		System.out.println(sol(nums, t));
	}

	public static int[] range(int[] a, int t) {
		int s = 0, e = 1;

		while (t > a[e]) {
			int h = e + 1;
			e += (e - s + 1) * 2;
			s = h;
		}
		
		return new int[] { s, e };
	}

	public static int sol(int[] a, int t) {

		int[] rng = range(a, t);
		int s = rng[0];
		int e = rng[1];

		while (s <= e) {
			int m = s + (e - s) / 2;
			if (a[m] == t)
				return m;
			else if (t < a[m])
				e = m - 1;
			else
				s = m + 1;
		} 
		return -1;
	}
}
