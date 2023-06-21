package day11;
import java.util.LinkedList;

import java.util.*;
public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		ll.add(45);
		ll.addLast(23);
		ll.add(67);
//		System.out.println(ll.element());
//		System.out.println(ll.indexOf(67));
//		System.out.println(ll);
//		ll.pop();
//		System.out.println(ll);
//		System.out.println(ll.poll());
//		ll.push(87654);
//		ll.iterator();
//		System.out.println(ll.isEmpty());
//		System.out.println(ll);
		Iterator i=ll.iterator();
		ListIterator ii=ll.listIterator();
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
		System.out.println("------------------------------");
		while(ii.hasPrevious()) {
			System.out.println(ii.previous());
		}
	}

}
