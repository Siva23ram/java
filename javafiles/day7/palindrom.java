package day7;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="shivu";
		 char[] arr=name.toCharArray();
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
		String s=new String(arr);
		System.out.println(s.toString());
		System.out.println(arr);
		
		/*if(s.equals(name)) {
			System.out.pri
		}*/
	}}

