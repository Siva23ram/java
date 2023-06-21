package day12;
import java.util.*;
public class sett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> ss=new HashSet<>();
		ss.add(12);
		ss.add(3);
		ss.add(65);
		ss.add(12);
		ss.add(43);
		for(int i:ss) {
			System.out.println(i);
		}
		
		//ss.remove(43);
		//ss.add("shiva");
		//ss.add("ram");
		//ss.add("shiva");
		//System.out.println(ss);
//		Iterator i=ss.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
	}

}
