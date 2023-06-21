package day10;
interface infe{
	public void name();
	public void details();
}
class class1 implements infe{
	public void name() {
		String name="shiva Ram";
		System.out.println(name);
	}
	public void details() {
		String name="shiva";
		int age=21;
		String collage="CBIT";
		System.out.println(name);
		System.out.println(age);
		System.out.println(collage);
	}
	
}
class class2 implements infe{
	public void name() {
		String name="rakshit kumar";
		System.out.println(name);
	}
	public void details() {
		String name="rakshi";
		int age=21;
		String collage="CBIT";
		System.out.println(name);
		System.out.println(age);
		System.out.println(collage);
	}
}

public class Interface1 {

	public static void main(String[] args) {
		class1 obj1=new class1();
		obj1.name();
		obj1.details();
		class2 obj2=new class2();
		obj2.name();
		obj2.details();
	}

}
