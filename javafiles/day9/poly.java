package day9;
class A{
	public A() {
		System.out.println("class A zero parameter constructor:");
	}
	public A(int x) {
		this();
		System.out.println("class A one parameter constructor:");
	}
	public A(int x,int y) {
		this(1);
		System.out.println("class A two parameter constructor:");
	}
	public A(int x,int y,int z) {
		this(2,3);
		System.out.println("class A three parameter constructor:");
	}
	
}
class b extends A{
	public b() {
		System.out.println("class b zero parameter constructor:");
	}
	public b(int x,int y) {
		super(2);
		System.out.println("class b two parameter constructor:");
	}
}
class c extends b{
	public c() {
		super(3,4);
		System.out.println("class c zero parameter constructor:");
	}
	public c(int x,int y,int z) {
		super(3,4);
		System.out.println("class c three parameter constructor:");
	}
}

public class poly {

	public static void main(String[] args) {
		//c ob1=new c();
		c ob2=new c(1,2,3);
	}

}
