package hello;

abstract class Calculator{
	abstract int sum(int a, int b);
	abstract int sub(int a, int b);
}

class CalImp extends Calculator{

	@Override
	int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
}

public class abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalImp ci = new CalImp();
		System.out.println(ci.sub(50, 30));
		System.out.println(ci.sum(10, 30));
		
	}

}
