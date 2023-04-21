package javaProgrames;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SmalestValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int temp=0;
		Integer a[]= {13,2,4,8,0};
		/*
		 * for (int i = 0; i < a.length; i++) { for (int j =i+1; j < a.length; j++) {
		 * if(a[i]<a[j]) { temp=a[i]; a[i]=a[j]; a[j]=temp; } }
		 * 
		 * } System.out.println(a[0]);
		 */
		
		//Arrays.sort(a);
		//System.out.println(a[0]);
		
		//Arrays.sort(a,Collections.reverseOrder());
		
		Arrays.sort(a, Collections.reverseOrder());
		
		System.out.println(a[0]);
	}

}
