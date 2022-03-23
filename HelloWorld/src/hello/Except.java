package hello;

public class Except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		try {
			int a=50/0;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("hello");
	}

}
