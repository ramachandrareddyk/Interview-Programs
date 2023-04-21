package javaProgrames;

public class FindCommanValuesInArray {

	public static void main(String[] args) {
		/*
		 * int [] a= {1,2,3,7}; int [] b= {1,5,2,7}; int [] c= {1,5,2,7};
		 * 
		 * for (int i = 0; i < a.length; i++) { for (int j = 0; j < b.length; j++) {
		 * if(a[i]==b[j] && a[i]==c[j]) { System.out.println(a[i]);
		 * 
		 * } } }
		 */
		
		int[] arr1 = {4, 2, 9, 7, 5};
		int[] arr2 = {1, 5, 8, 3, 6};
		int[] arr3 = {7, 3, 6, 2, 1};

		for(int i=0; i < arr1.length; i++) {
		for (int j = 0; j < arr2.length; j++) {
			for (int j2 = 0; j2 < arr3.length; j2++) {
				if(arr1[i] == arr2[j] ) {
					System.out.println(arr1[i]);
					
					if(arr2[j]==arr3[j2]) {
						System.out.println(arr2[i]);
					}
					
					if(arr1[i]==arr3[j2]) {
						System.out.println(arr1[i]);
					}
			}
		}
		}
		
	}
	}

}
