package Sort;

public class RadixSort {

	public static void main(String[] args) {
		int[] nums = {223, 345, 574, 673, 288, 444, 254, 667, 697, 443};
		int d = 3; // no. of digits
		
		System.out.println("Before Sorting");
		display(nums);
		
		//Implement CountingSort
		int[] res = sort(nums, d);
		
		System.out.println("After Sorting");
		display(res);
	}
	
	public static void display(int[] nums) {
		for(int n:nums) {
			System.out.print(n + " ");
		}
		System.out.print("\n");
	}
	
	public static int[] sort(int[] a, int d) {
		int[] res = new int[a.length];
		for(int x=0; x<a.length; x++) {
			res[x] = a[x];
		}
		for(int i=0; i<d; i++) {
			
			for(int x=0; x<a.length; x++) {
				a[x] = res[x];
			}
			// Counting Sort
			int[] cnt = new int[10];
			
			for(int x=0; x<a.length; x++) {
				cnt[(a[x]/((int) Math.pow(10, i)))%10]++;
			}
			
			for(int x=1; x<10; x++) {
				cnt[x] += cnt[x-1];
			}
			
			for(int x=a.length-1; x>=0; x--) {					
				res[cnt[(a[x]/((int) Math.pow(10, i)))%10]-1] = a[x];
				cnt[(a[x]/((int) Math.pow(10, i)))%10]--;
			}
		}
		return res;
	}
}
