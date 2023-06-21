package day6;
import java.util.Scanner;
public class diagonal{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int sum=0;
int a[][][]=new int[3][][];
a[0]=new int[3][];
a[1]=new int[3][];
a[2]=new int[3][];
a[0][0]=new int[1];
a[0][1]=new int[1];
a[0][2]=new int[1];
a[1][0]=new int[1];
a[1][1]=new int[1];
a[1][2]=new int[1];
a[2][0]=new int[1];
a[2][1]=new int[1];
a[2][2]=new int[1];
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
for(int k=0;k<a[i][j].length;k++){
a[i][j][k]=sc.nextInt();
}
}
}
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
for(int k=0;k<a[i][j].length;k++){
sum=a[]
}
}
System.out.println();
}
System.out.println();}
System.out.println("sum of daigonal elements:"+sum);
}}
