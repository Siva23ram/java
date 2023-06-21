package day9;
abstract class par{
	abstract void my(int a,int b);
par(){
	int x=10;int y=20;
	int z=x+y;
	System.out.println(z);
	}
}
class chi extends par{
	public void my(int a,int b) {
		System.out.println(a+b);
	}
}

public class Abstractconstuctor {

	public static void main(String[] args) {
   chi obj=new chi();
   obj.my(10,40);
	}

}
