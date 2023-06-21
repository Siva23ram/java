package day13;
import java.util.*;
class print extends Thread{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	public void run() {
		if(n==1){
			System.out.println("printing started");
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();1
			}
			System.out.println("this is the main thread");
		}
		System.out.println("printing ended");
	}
}}
class multi extends Thread{
	public void run() {
		int a=23;
		int b=21;
		int d=a*b;
		System.out.println("multiplication started");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("multiplication ended");
	}
}
class div extends Thread{
	public void run() {
		int a=23;
		int b=21;
		int c=a/b;
		System.out.println("divison started");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("division ended");
		}
	}
public class Multithre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multi ob2=new multi();
		ob2.start();
		div ob3=new div();
		ob3.start();
		print ob1=new print();
		ob1.start();

	}

}

