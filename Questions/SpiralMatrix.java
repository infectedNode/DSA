package Questions;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	public static void main(String[] args) {
		int[][] m = {{1,2},{5,6},{9,10}, {13,14}};
		
		display(m);
		System.out.println("\nAfter Conversion:-\n");
		
		System.out.println(sol(m));
	}
	
	public static List<Integer> sol(int[][] m) {
		List<Integer> l = new ArrayList<>();
        
		int[] p1 = {0,0};
		int[] p2 = {0, m[0].length-1};
		int[] p3 = {m.length-1, m[0].length-1};
		int[] p4 = {m.length-1, 0};

		int t=0;
		int size = m.length*m[0].length;
		
		while(t < size) {	
			for(int i=p1[1]; i<=p2[1]; i++) {
				if(t >= size) break;
				l.add(m[p1[0]][i]);
				t++;
			}
			p1[0]++;
			p1[1]++;
			p2[0]++;
			p2[1]--;
			
			for(int i=p2[0]; i<=p3[0]; i++) {
				if(t >= size) break;
				l.add(m[i][p3[1]]);
				t++;
			}
			p3[0]--;
			p3[1]--;
			
			for(int i=p3[1]; i>=p4[1]; i--) {
				if(t >= size) break;
				l.add(m[p4[0]][i]);
				t++;
			}
			p4[0]--;
			p4[1]++;
			
			for(int i=p4[0]; i>=p1[0]; i--) {
				if(t >= size) break;
				l.add(m[i][p1[1]-1]);
				t++;
			}
		}
        
        return l;
	}
	
	public static void display(int[][] m) {
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
}
