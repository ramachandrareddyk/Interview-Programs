package javaProgrames;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		//Array list is the dynamic array
		//Arraylist is the default class in the java
		//Size is not fixed
		//values willstore in index based
		//to create arraylist we have to create Arraylist Class object
		
		
		ArrayList ar=new ArrayList();
		
		System.out.println(ar.size());//0
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());//3
		
		ar.add(500);//3
		ar.add(600);//4
		
		System.out.println(ar.size());//5
		
		ar.add(700);//5
		ar.add(800);//6
		
		System.out.println(ar.size());//7
		
		ar.remove(3);
		
		System.out.println(ar.get(3));
		
		System.out.println(ar.size());//6
		
		//to print all the values from arraylist  for loop
		System.out.println("---------------get values from arraylist using for loop-------------");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		ar.add("Testing");
		ar.add(12.33);
		ar.add(true);
		ar.add('F');
		System.out.println("---------------get values from arraylist using for each loop-------------");
		for(Object e:ar) {
			System.out.println(e);
		}
		
		ArrayList<String>EmpNames= new ArrayList<String>();
		EmpNames.add("Tom");
		EmpNames.add("peter");
		
		for(String e:EmpNames) {
			System.out.println(e);
		}
		
		ArrayList<Integer>EmpNumber=new ArrayList<Integer>();
		
		EmpNumber.add(1003);
		EmpNumber.add(1004);
		
		for(Integer e:EmpNumber) {
			System.out.println(e);
		}
		
		ArrayList<Character>gender=new ArrayList<Character>();
		gender.add('F');
		gender.add('M');
		
		//Emp data arraylist
		
		ArrayList<Object>empdata=new ArrayList<Object>();
		
		empdata.add("Peter");//0
		empdata.add(36);//1
		empdata.add(36000.78);//2
		empdata.add(true);//3
		empdata.add('M');//4
		
		//System.out.println(empdata.get(5));
		
		for(Object e:empdata) {
			System.out.println(e);
		}
		
		//use case in selenium
		//we have 100 links in the page
		//i want to collect all the links in the page we have store in arraylist
		//write for loop
		//get etxt method in selenium
		//break;
		
		

	}

}
