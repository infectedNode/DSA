package Sort;

public class QuickSort {

	public static void main(String[] args) {
//		int[] nums = {2, 3, 5, 7, 2, 4, 5, 6, 7, 3};
		int[] nums = {4, 9, 80, 20, 3, 9};
		
		System.out.println("Before Sorting");
		display(nums);
		
		//Implement QuickSort
		sort(nums, 0, nums.length-1);
		
		System.out.println("After Sorting");
		display(nums);
	}
	
	public static void display(int[] nums) {
		for(int n:nums) {
			System.out.print(n + " ");
		}
		System.out.print("\n");
	}
	
	public static void sort(int[] a, int str, int end) {
		if(str < end) {
			int p = partition(a, str, end);
			sort(a, str, p-1);
			sort(a, p+1, end);
		}
	}
	
	public static int partition(int[] a, int str, int end) {
		int indx = str;
		for(int i=str; i<end; i++) {
			if(a[i] <= a[end]) {    // a[i] >= a[end] => for decreasing order
				swap(a, indx++, i);
			}
		}
		swap(a, indx, end);
		return indx;
	}
	
	public static void swap(int[] a, int indx1, int indx2) {
		int temp = a[indx1];
		a[indx1] = a[indx2];
		a[indx2] = temp;
	}
}
