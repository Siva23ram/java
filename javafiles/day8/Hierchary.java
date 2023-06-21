package day8;
class parent{
	int a=10;
	int b=20;
}
class child1 extends parent{
	int c=5;
	int d=a+b+c;
}
class child2 extends parent{
	int e=a+b;
}

public  class Hierchary {
	public static void main(String []args) {
		child1 obj=new child1();
		child2  ob=new child2();
		System.out.println(obj.d);
		System.out.println(ob.e);
	}

}
