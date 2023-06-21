package day8;

 class shiva{
	public int  myfunction(int a,int b) {
	int c=a+b;
	return c;
	} 
	public int myfunction(int x,int y,int z) {
		return (x+y+z);
	}}
public class Opps extends shiva{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Opps myobj=new Opps();
     System.out.println(myobj.myfunction(10,20));
     System.out.println(myobj.myfunction(20, 30,10));
	}}
