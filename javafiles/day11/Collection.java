package day11;
import java.util.ArrayList;
public class Collection {

	public static void main(String[] args) {
		/*ArrayList obj=new ArrayList();
		ArrayList obj1=new ArrayList();
		obj.add(90);
		obj.add("shiva");
		obj.add(34.78);
		obj.add(0.0986754);
		System.out.println(obj.indexOf(34.78));
		System.out.println(obj.contains(34.7));
		obj1.addAll(obj);
		obj1.add(3,5678);
		obj1.remove(4);
		obj1.remove("shiva");
		System.out.println(obj1.subList(0, 3));
		System.out.println(obj1.get(2));
		System.out.println(obj1.set(1, "shiva"));
		System.out.println(obj1);*/
		ArrayList<String> s1=new ArrayList<String>();
		s1.add("shiva");
		s1.add("rakshi");
		//s1.add(23);
		for(String obj:s1){
			System.out.println(obj);
		}

	}

}
