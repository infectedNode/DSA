package Search;

public class LinearSearch {

	public static void main(String[] args) {
		int[] nums = {2, 3, 5, 2, 4, 5, 6, 7, 3};
//		              0  1  2  3  4  5  6  7  8
		int numToSearch = 7;
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == numToSearch) {
				System.out.println("Position of the ele "+numToSearch+" is: "+i);
				break;
			}
		}
	}

}

//Time : O(n)