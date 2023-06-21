import java.util.*;
import java.lang.reflect.*;
public class two{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
 int a[]={10,20,30,40};
Class ct=a.getClass().getComponentType();
System.out.println("Type:"+ct);
int length=Array.getLength(a);
System.out.println("length:"+length);
int ele=(int)Array.get(a,3);
System.out.println("element:"+ele);
Array.set(a,3,88);
int modifiedelement=a[3];
System.out.println("modifiedelement:"+modifiedelement);
System.out.println(Arrays.toString(a));
}}
