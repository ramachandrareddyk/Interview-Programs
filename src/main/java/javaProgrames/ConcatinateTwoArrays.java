package javaProgrames;

import java.util.Arrays;

public class ConcatinateTwoArrays {

	public static void main(String[] args) {
int a[]= {1,2,3};
		
		int b[]= {4,5,6};
		
		int alength=a.length;
		int blength=b.length;
		int result[]=new int[alength+blength];
		System.arraycopy(a, 0, result, 0, alength);
		System.arraycopy(b, 0, result, alength, blength);
		
		System.out.println(Arrays.toString(result));// TODO Auto-generated method stub

	}

}
