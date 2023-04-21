package javaProgrames;

import java.util.HashMap;
import java.util.Map;

public class CompareTwoHashMaps {
public static void main(String[] args) {
		
		Map<Integer, String> mapA=new HashMap<Integer,String>();
		
		mapA.put(1,"Tom");
		mapA.put(2,"Peter");
		
		Map<Integer, String> mapB=new HashMap<Integer,String>();
		
		mapB.put(1,"Phill");
		mapB.put(2,"Peter");
		
		
		boolean b= mapA.entrySet().stream().filter(value->mapB.
				entrySet().stream().anyMatch(value1->(value1.
						getKey()==value.getKey() && value1.getValue()==value.
						getValue()))).findAny().isPresent();
		
		System.out.println(b);

	}
	
}
