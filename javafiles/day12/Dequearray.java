package day12;
import java.util.*;
public class Dequearray {

	public static void main(String[] args) {
	ArrayDeque<Integer> q=new ArrayDeque<Integer>();
	q.add(23);
	q.add(34);
	q.add(45);
	q.addFirst(1);
	q.addLast(100);
	q.contains(34);
	q.offerFirst(4);
	q.push(76);
	q.pop();
	q.remove();
	q.remove(100);
	System.out.println(q.size());
	System.out.println(q.hashCode());
	for(int i:q) {
		System.out.println(i);
	}
	}

}
