package javaProgrames;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class DuplicatesInString 
{
    public static void main( String[] args )
    {
        String string1="Automation";
        
        int count;  
        
        //Converts given string into character array  
        char string[] = string1.toCharArray();  
          

        for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
            //A character is considered as duplicate if count is greater than 1  
            if(count > 1 && string[i] != '0')  
                System.out.println(string[i]);  
            
          
           
        }  
        System.out.println("----------------------------------");
        findDuplicatesInString();
    }
    
    public static void findDuplicatesInString() {
    	
    	String str="abcdegfabceadzxvx";
    	 Map<Character, Integer> map = new HashMap<Character, Integer>(); 
    	 
    	    //Convert the String to char array
    	    char[] chars = str.toCharArray();
    	 
    	    /* logic: char are inserted as keys and their count
    	     * as values. If map contains the char already then
    	     * increase the value by 1
    	     */
    	    for(Character ch:chars){
    	      if(map.containsKey(ch)){
    	         map.put(ch, map.get(ch)+1);
    	      } else {
    	         map.put(ch, 1);
    	        }
    	    }
    	 
    	    //Obtaining set of keys
    	    Set<Character> keys = map.keySet();
    	 
    	    /* Display count of chars if it is
    	     * greater than 1. All duplicate chars would be 
    	     * having value greater than 1.
    	     */
    	    for(Character ch:keys){
    	      if(map.get(ch) > 1){
    	        System.out.println("Char "+ch+" "+map.get(ch));
    	      }
    	    }
    	  
    }
}
