import java.util.*;
public class arr{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String arr[]=new String[5];
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextLine();

}
Arrays.sort(arr);
String key="shiva";
System.out.println(Arrays.toString(arr));
System.out.println(Arrays.binarySearch(arr,key));
System.out.println(Arrays.(arr));

}
}