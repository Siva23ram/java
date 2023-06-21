package day13;
import java.util.*;
public class SingleThread {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1){
			System.out.println("printing started");
		for(int i=0;i<5;i++) {
			try {
				t.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("this is the main thread");
		}
		System.out.println("printing ended");
		int a=23;
		int b=21;
		int d=a*b;
		System.out.println("multiplication started");
		try {
			t.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("multiplication ended");
		int c=a/b;
		System.out.println("divison started");
		try {
			t.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("division ended");
		}
		

	}

}
