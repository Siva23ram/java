import java.util.*;
public class fst{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int c1=0;
int c2=0;
int c3=0;
int n=sc.nextInt();
String arr[]=new String[n];
for(int i=0;i<n;i++){
arr[i]=sc.next();
}
System.out.println(Arrays.toString(arr));
for(int i=0;i<n;i++){
if(arr[i].equals("yes")){
c1+=1;
}
else if(arr[i].equals("no")){
c2+=1;
}
else{
c3=c3+1;
}}

if(c1==n){
System.out.println("yes ");
}
else if(c2==n){
System.out.println("no ");
}
else{
System.out.println("invalid");
}}}
