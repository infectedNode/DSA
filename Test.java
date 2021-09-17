

public class Test {

	public static void main(String[] args) {
		
//		Testing Type Casting
//		double d = (2*8.0f)/7;
//		System.out.println("the value is: " + d);
		
//		System.out.println((int) Math.pow(10, 2));
		
//		int n = 0;
//        Random rd = new Random();
//        int pivot = rd.nextInt(n);
        
//		int[] a = {0, -12, 11, -13, -5, 6, -7, 5, -3, -6};
//		
//		int idx = 0;
//		
//		for(int i=0; i<a.length; i++) {
//			if(a[i] < 0) {
//				swap(a, i, idx++);
//			}
//		}
//		
//		for(int x:a) {
//			System.out.print(x + " ");
//		}
		
//		int a = 10;
//		
//		switch(a) {
//			case 12 -> System.out.println("its working");
//			default -> {
//				System.out.println("its working perfectly");
//			}
//		}
//		
//		{
////			int a = 2;
//		}
		
		// 2D Arrays
//		int[][] arr2d = {{1,2,3,5}, {4,5,6}, {}};
//		
//		for(int[] x:arr2d) {
//			System.out.print(x.length + " -> ");
//			System.out.print(Arrays.toString(x) + "\n");
//		}
//		
//		String str = "shivam";
//		str.length();
		
//		String name = "Shivam";
//		
//		char[] arr = name.toCharArray();
//		
//		for(char a:arr) {
//			System.out.print(a + " ");
//		}
		
		System.out.println(-1%5);
	}
	
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
