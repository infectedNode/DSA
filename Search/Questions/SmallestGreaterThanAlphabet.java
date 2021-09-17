package Search.Questions;

public class SmallestGreaterThanAlphabet {
	public static void main(String[] args) {
		char[] c = { 'b', 'b', 'd', 'f', 'x' };
		char t = 'b';
		System.out.println(sol(c, t));

	}

	public static char sol(char[] c, char t) {

		if (t >= c[c.length - 1]) return c[0];

		int s = 0;
		int e = c.length - 1;

		while (s <= e) {
			int m = s + (e - s) / 2;
			if(t >= c[m]) s = m+1;
			else e = m-1;
		}

		return c[s];
	}
}
