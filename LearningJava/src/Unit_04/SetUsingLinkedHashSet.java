package Unit_04;

import java.util.* ; 

/* {Set}
 * No Duplicates
 * at most one null element
 * 
 * {LinkedHashset}
 * Inside, It uses doubly-linked list
 * Preserve insertion order 
 * */

public class SetUsingLinkedHashSet {

	public static void main(String[] args) {
		Set<String> hs = new LinkedHashSet<String>() ; 
		hs.add("Dikshant") ;
		hs.add("Kamboj") ;
		hs.add("Dikshant") ;
		hs.add("Dikshant") ;
		hs.add("Java") ;
		hs.add("Python") ;
		hs.add("HTML") ;
		
		System.out.println(hs);
		hs.remove("HTML") ; // Remove the element if exists 
		System.out.println("After removing the element");
		System.out.println(hs);
		System.out.println("Is set contain the java "+hs.contains("Java")); // check the set contain the element or not
		System.out.println("The size of the set is "+hs.size());
	}

}
