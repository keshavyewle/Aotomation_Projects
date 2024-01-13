package collections;

import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"abc","xyz","pqr"};
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		// adding data to the list
		list1.add("Akshay");
		list1.add("Priya");
		list1.add("Pankaj");
		
		System.out.println(list1);
		
		// Access the data at 3rd position
		System.out.println("the data at 3rd position is " + list1.get(2));

		
		//removing the data
		list1.remove(0);
		System.out.println(list1);
		
		// Access the data at 1st position
		System.out.println("the data at 1st position is " + list1.get(0));

        list1.add("Deepa");
		list1.add("Aprana");
		System.out.println(list1);
		
		//Print the last name into the array list
		System.out.println("Last name is " + list1.get(list1.size()-1));

		//change the value at 3rd position
		list1.set(2, "Savita");
		System.out.println(list1);

	
		// Iterate through the list
		for(int i=0;i<list1.size();i++) {
			
			//System.out.println("Value at index " + i + " "  + list1.get(i));
			
			if(list1.get(i).equals("Savita")) {
				System.out.println("Value savita is at index " + i);
			}
		}
		
		for(String name:list1) {
			
			System.out.println(name);
		}

// Sorting of the data in ascending order
//		Collections.sort(list1);
		System.out.println(list1);
		
		// Sorting of the data in descending order
//		Collections.sort(list1,Collections.reverseOrder());
		System.out.println(list1);
	}


	}



