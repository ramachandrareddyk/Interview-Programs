package javaProgrames;

public class StringConcepts {
	public static void main(String[] args) {

		/*
		 * String str = "abc";
		 * 
		 * String str1 = "a";
		 * 
		 * String b = "a";
		 * 
		 * System.out.println(str);// Abc String str1="abc";
		 * 
		 * str.concat(str1); System.out.println(str);
		 * 
		 * String str2 = str.concat(str1);
		 * 
		 * System.out.println(str2);
		 * 
		 * String s = "abc"; String s1 = new String("abc");
		 * 
		 * System.out.println(s); System.out.println(s1);
		 * 
		 * System.out.println(s.hashCode()); System.out.println(s1.hashCode());
		 */
		test("ramu.reddy.kiran@gmail.com");

	}

	public static void test(String str) {// ramu.reddy@gmail.com;
		String Words[] = str.split("@");
		String fullName = "";

		for (int i = 0; i < Words.length; i++) {
//			System.out.println(Words[i]);
			fullName = fullName+Words[i].replace(".", " ");
//			break;

		}

		System.out.println(fullName);

	}

}
