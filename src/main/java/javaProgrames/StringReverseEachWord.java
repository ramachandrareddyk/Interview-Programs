package javaProgrames;

public class StringReverseEachWord {

	public static void main(String[] args) {
		
		String str="My name is ram";
		String words[]=str.split("\\s");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    System.out.println(reverseWord.trim());
	}

}
