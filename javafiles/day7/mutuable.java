package day7;

public class mutuable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("Shiva");
		StringBuilder s1=new StringBuilder("Rakshi");

		System.out.println(s.append(" Ram"));
		System.out.println(s1);
		System.out.println(s.insert(5, "Sanaka"));
		System.out.println(s.delete(5, 12));
		System.out.println(s.reverse());
	}

}
