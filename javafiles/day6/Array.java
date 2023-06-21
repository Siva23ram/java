package day6;
import java.util.Arrays;
import java.lang.reflect.*;
public class Array {

	public static void main(String[] args) {
	int array_size=6;
	//System.out.println("hello");
	int[]int_array=(int[])Array.newInstance(int.class,array_size);
	System.out.println(Arrays.toString(int_array));
	}
}
