package Search.Questions;

public class CeilingFloorOfNumber {
	public static void main(String[] args) {
		int[] nums = { 2, 4, 6, 7, 9, 13, 15, 20, 40, 67 };
		int t = 14;

		System.out.println("Cieling: " + ceiling(nums, t));
		System.out.println("Floor: " + floor(nums, t));
	}

	public static int ceiling(int[] a, int t) {

		int s = 0;
		int e = a.length - 1;

		while (s <= e) {
			int m = s + (e - s) / 2;
			if (a[m] == t)
				return m;
			else if (t < a[m])
				e = m - 1;
			else
				s = m + 1;
		}

		if (s >= a.length)
			return -1;

		return a[s];
	}

	public static int floor(int[] a, int t) {

		int s = 0;
		int e = a.length - 1;

		while (s <= e) {
			int m = s + (e - s) / 2;
			if (a[m] == t)
				return m;
			else if (t < a[m])
				e = m - 1;
			else
				s = m + 1;
		}

		if (e < 0)
			return -1;

		return a[e];
	}
}
