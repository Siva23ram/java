package day12;
import java.util.*;
public class Stac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push(12);
		s.add(0, "hello");
		s.add(34.76);
		s.insertElementAt(0, 0);
		s.removeElementAt(3);
		s.pop();
		System.out.println(s.search(12));
		System.out.println(s.lastIndexOf("hello"));
		System.out.println(s.firstElement());
		System.out.println(s.get(1));
		//System.out.println(s.indexOf(34.76, 0));
		System.out.println(s.elementAt(1));
			System.out.println(s);
	}

}
