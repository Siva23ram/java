package day11;
import java.util.*;
public class Iter {

	public static void main(String[] args) {
	ArrayList z=new ArrayList();
	z.add("arpita");
	z.add("tejashwini");
	z.add("kiran");
	z.add("rajeshwari");
	z.add("vinod");
	z.
	ListIterator zz=z.listIterator();
	System.out.println(zz.nextIndex());
	while(zz.hasNext()) {
			System.out.println(zz.next());
	}

	}

}
