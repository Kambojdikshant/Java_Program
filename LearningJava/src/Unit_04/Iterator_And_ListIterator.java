package Unit_04;

import java.util.* ; 

/* We have 2 iterators in Java:
	* Iterator: next(), hasNext(), remove();
	* ListIterator: Iterator + previous(), hasPrevious(), access next and previous index;
* */

public class Iterator_And_ListIterator {

	public static void main(String[] args) {
		iterator() ; 
		listIterator() ; 
	}
    static void iterator() {
    	List<Integer> l1 = new ArrayList<Integer>() ; 
    	l1.add(2) ; 
    	l1.add(3) ; 
    	l1.add(4) ; 
    	l1.add(5) ; 
    	l1.add(6) ; 
    	l1.add(7) ; 
    	
    	System.out.println("Printing by the iterator");
    	Iterator<Integer> it = l1.iterator() ; 
    	while(it.hasNext())
    	{
    		System.out.print(it.next() + " ");
    	}
    	it.remove(); // it will remove the last element from the list 
    	it = l1.iterator() ; 
    	System.out.println("After removing the element");
    	while(it.hasNext())
    	{
    		System.out.print(it.next() + " ");
    	}
    }
    static void listIterator()
    {
    	List<Integer> l2 = new ArrayList<Integer>() ; 
    	l2.add(8) ; 
    	l2.add(9) ;
    	l2.add(10) ;
    	l2.add(11) ;
    	l2.add(12) ;
    	l2.add(13) ;
    	System.out.println("\nPrinting by the ListIterator");
    	ListIterator it = l2.listIterator() ; 
    	while(it.hasNext())
    	{
    		System.out.print(it.next()+" ");
    	}
    	it.remove(); // removing the last element 
    	
    	System.out.println("\nAfter Removing the last elemnent and printing in the reverse order");
    	while(it.hasPrevious())
    	{
    		System.out.print(it.previous()+" ");
    	}
    	it = l2.listIterator() ;
    	it.add(45);
    	while(it.hasNext())
    	{
    		System.out.print(it.next()+" ");
    	}
    }
}
