package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> al1 = new ArrayList<String>();
		//2. Add five Strings to your list
		al1.add("Wendy");
		al1.add("Olivia");
		al1.add("Julia");
		al1.add("Alex");
		al1.add("Apaara");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < al1.size(); i++) {
			System.out.println(al1.get(i));
		}
		System.out.println();
		//4. Print all the Strings using a for-each loop
		for (String x:al1) {
			System.out.println(x);
		}
		System.out.println();
		//5. Print only the even numbered elements in the list.
		for (int j = 0; j < al1.size(); j+=2) {
			System.out.println(al1.get(j));
		}
		System.out.println();
		//6. Print all the Strings in reverse order.
		for (int a = al1.size()-1; a >= 0; a--) {
			System.out.println(al1.get(a));
		}
		System.out.println();
		//7. Print only the Strings that have the letter 'e' in them.
		for (String y:al1) {
			if (y.contains("e")) {
				System.out.println(y);
			}
			else {
				//
			}
		}
	}
}
