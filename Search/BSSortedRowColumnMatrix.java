package Search;

import java.util.Arrays;

// O(n)
public class BSSortedRowColumnMatrix {

	public static void main(String[] args) {
		int[][] m = {
				{10, 20, 30, 40},
				{15, 21, 32, 43},
				{17, 22, 36, 47}
		};
		
		int t = 47;
		
		System.out.println(Arrays.toString(search(m, t)));
	}

	public static int[] search(int[][] m, int t) {

		int row = 0;
		int col = m.length-1;
		
		while(row < m.length && col >= 0) {
			if(m[row][col] == t) return new int[] {row, col};
			else if(t < m[row][col]) col--;
			else row++;
		}
		return new int[] {-1, -1};
	}

}
