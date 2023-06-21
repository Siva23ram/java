package day13;
import java.util.*;
public class Multithreading {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		float c;
		try {
		 c=a/b;
		}
		catch(Exception E) {
			System.out.println("b value always greater than 1");
		}
		//System.out.println(c);

	}

}
