package javaProgrames;

import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {
//		System.out.println('j'+'a'+'v'+'a');// adding the asci values
		for (int i = 'a'; i < 'z'; i++) {
			System.out.println(i);
		}

		System.out.println("=====alphabets======");
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.println(i);
		}
		System.out.println("break");

		for (int i = 1; i <= 10; i++) {
			if (i == 5)
				break;
			System.out.println(i);
		}
		System.out.println("=============");
		System.out.println("continue");
		for (int i = 1; i <= 10; i++) {
			if (i == 5)
				continue;
			System.out.println(i);
		}
	}

}
