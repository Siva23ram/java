package day9;
 class car{
	//public abstract void drive();
	public void fly() {
		System.out.println("drive");
	}
}
/* abstract class mycar extends car{
	public abstract void flying();
	public void drive() {
		System.out.println("driving");
	}}
 class updatecar extends mycar{
	public void flying() {
		System.out.println("flying");
	}}*/
 
public class Abstraction  {

	public static void main(String[] args) {
		car obj=new car();
		obj.fly();
		//obj.drive();
		//obj.flying();

	}

}
