import java.util.*;
public class bunk{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
float c=sc.nextFloat();
String s=sc.next();
if(s.equals("A")){
System.out.printf("%.2f",b/c);
System.out.println();
}
else{
System.out.printf("%.2f",(b-a)/c);
System.out.println();
System.out.printf("%.2f",a/c);
}
}}