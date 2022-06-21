package Unit_04;
import java.util.List ; 
import java.util.ArrayList;

/* {List}
 * Duplicates are allowed
 * Multiple Null Values are allowed
 * Preserve Insertion Order
 * */

public class ListUsingArrayList {

	public static void main(String[] args) {
          List<Integer> l1 = new ArrayList<Integer>() ; 
          l1.add(5) ; // for adding the element in the list 
          l1.add(6) ; 
          l1.add(7) ; 
          l1.add(3,8) ;  // adding the element at the index 3
          l1.add(4,null) ;
          l1.add(4,10) ;
          System.out.println(l1);
          
          // creating a another list and merge it with the list l1 
          List<Integer> l2 = new ArrayList<Integer>() ;
          l2.add(7) ; 
          l2.add(10) ; 
          l2.add(11) ; 
          l2.add(null) ; 
          
          // it will add the all the element of list l1 in list l2 
          l1.addAll(6,l2) ; 
          System.out.println(l1);
          
          // Remove the element from the 6 index
          l1.remove(6) ; 
          System.out.println(l1);
          
          // To print the element at the index three 
          System.out.println(l1.get(3));
          
          // To set a element at the 0th index
          l1.set(0,15);
          System.out.println(l1);
	}

}
 