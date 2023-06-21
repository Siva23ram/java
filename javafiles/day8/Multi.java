package day8;
class A{
	int a=10;
}
class B extends A{
	int b=20;
}
class C extends B{
	int c=30;
}

public class Multi extends C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi myobj=new Multi();
		System.out.println(myobj.a);
		System.out.println(myobj.b);
		System.out.println(myobj.c);
	}

}
