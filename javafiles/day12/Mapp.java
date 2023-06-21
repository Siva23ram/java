package day12;
import java.util.*;
public class Mapp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "shiva");
		map.put(5, "rakshi");
		map.put(3,"indra");
		map.put(0, "kiran");
		map.put(3, "rakshitha");
		Set st=map.entrySet();
		Iterator i=st.iterator();
		while(i.hasNext()) {
			Map.Entry entry=(Map.Entry)i.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
