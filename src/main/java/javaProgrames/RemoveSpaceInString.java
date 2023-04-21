package javaProgrames;

public class RemoveSpaceInString {

	
	
	public static void main(String[] args) {
		String s="This is Monday";
		
		
		System.out.println(s.length());
		s.replaceAll(" ", "");
		System.out.println(s.replaceAll(" ", "").length());
	}
}
