package day8;

public class inheritence {
	static int myfunction(int a) {
		a=10;
		return a;
	}
public class properties extends inheritence{
	static int mymethod(int b) {
		int c=a+b;
		return c;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inheritence obj=new inheritence();
		System.out.println(obj.mymethod(10));
	}

}}
