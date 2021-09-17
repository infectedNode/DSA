package Search;

import java.util.Arrays;

// O(logn)
public class BSSortedMatrix {

	public static void main(String[] args) {
		int[][] m = {
				{1,  2,  3,  4},
				{5,  6,  7,  8},
				{9,  10, 12, 13},
				{14, 15, 16, 17}
		};
		
		int t = 14;
		
		System.out.println(Arrays.toString(search(m, t)));
	}

	public static int[] search(int[][] m, int t) {

		int rowstart = 0;
		int rowend = m.length-1;
		
		while(rowstart <= rowend) {
			int c = rowstart + (rowend - rowstart) / 2;
			if(t >= m[c][0] && t <= m[c][m[c].length-1]) return binarysearch(m, t, c);
			else if(t > m[c][0]) rowstart = c+1;
			else rowend = c-1;
		}
		
		return new int[] {-1, -1};
	}

	public static int[] binarysearch(int[][] m, int t, int r) {
		
		int s = 0;
		int e = m[r].length-1;
		
		while(s<=e) {
			int c = s + (e - s) / 2;
			if(t == m[r][c]) return new int[]{r, c};
			else if(t > m[r][c]) s = c+1;
			else e = c-1;
		}
		
		return new int[]{-1, -1};
	}

}
