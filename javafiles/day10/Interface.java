
package day10;
interface inf{
	public String name();
	public void fun();
}
class myname implements inf{
	public String name() {
		String nam="shiva";
		return nam;
	}
	public void fun() {
		System.out.println("we have implemented the interface concept:");
	}
}

public class Interface {

	public static void main(String[] args) {
		myname a=new myname();
		System.out.println(a.name());
		a.fun();
	}

}
