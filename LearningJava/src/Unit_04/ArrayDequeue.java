package Unit_04;

import java.util.* ; 

/*
The ArrayDeque in Java provides a way to apply re-sizable array in addition to the implementation of the Deque interface.
It is also known as Array Double Ended Queue or Array Deck.
This is a special kind of array that grows and allows users to add or remove an element from both sides of the queue. 
*/

public class ArrayDequeue {

	public static void main(String[] args) {
		Deque<Integer> dq = new ArrayDeque<Integer>() ;
		
		dq.add(5) ;
		dq.add(8) ;
		dq.add(7) ;
		dq.add(9) ;
		dq.add(10) ;
		dq.add(5) ;
		
		System.out.println(dq);
		dq.addFirst(89);
		dq.addFirst(90);
		dq.addFirst(95);
		dq.addLast(258) ;
		dq.addLast(589) ;
		dq.addLast(782) ;
		System.out.println(dq);
		dq.remove(258) ; 
		System.out.println("After Removing the index");
		System.out.println(dq);
	    System.out.println("Printing using the iterator");
	    Iterator it = dq.iterator() ; 
	    while(it.hasNext())
	    {
	    	System.out.print(it.next() + " ");
	    }
	}

}
