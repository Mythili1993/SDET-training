package Package3;

import java.util.ArrayList;

public class Activity3_1 {

	public static void main(String[] args) {
		
	  ArrayList<String> myList = new ArrayList<String>();
	  
		myList.add("Dog");
        myList.add("Plane");
        myList.add("Car");
        myList.add("Grapes");
        myList.add("Apple");
        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Chicku is in list: " + myList.contains("Chicku"));
        System.out.println("Size of ArrayList: " + myList.size());
        
        myList.remove("Apple");
        
        System.out.println("New Size of ArrayList: " + myList.size());

	}

}
