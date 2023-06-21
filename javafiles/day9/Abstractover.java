package day9;
abstract class parent{
	abstract  void my(int a,int b);
}
  class child extends parent{
	 //abstract void my(int x,int y,int z);
	public void my(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
}
/* class child1 extends child{
	 public void my(int x,int y,int z) {
		  int w=x+y+z;
			System.out.println(w);
		
	 }
 }
*/
public class Abstractover {

	public static void main(String[] args) {
		child obj=new child();
		obj.my(10,20);
		//obj.my(12,34,56);

	}

}
