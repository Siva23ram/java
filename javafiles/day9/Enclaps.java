package day9;
class name{
	private String nam="shiva";
	String getnam() {
		return nam;
	}
	String get() {
		String nam="ram";
		return nam;
	}

}

public class Enclaps {

	public static void main(String[] args) {
		name ob=new name();
		System.out.println(ob.get());
	}

}
