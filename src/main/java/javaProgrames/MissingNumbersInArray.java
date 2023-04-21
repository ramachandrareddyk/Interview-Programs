package javaProgrames;

public class MissingNumbersInArray {
	public static void main(String[] args) {
		int count = 0;
		
		int []arr= {1,2,3,5,6,7,8,9};
		for(int i=0;i<arr.length;i++) {
			count=count+arr[i];
		}
		System.out.println(count);
		
		int value=0,total;
		for(int j=1;j<=9;j++) {
			value=value+j;
		}
		System.out.println(value);
		total=value-count;
		System.out.println(total);
	}

}
