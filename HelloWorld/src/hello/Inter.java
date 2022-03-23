package hello;

    interface  CalculatorSumandSub{
	 int sum(int a, int b);
	 int sub(int a, int b);
}

interface  CalculatorMulandDiv extends CalculatorSumandSub{
	 int Mul(int a, int b);
	int Div(int a, int b);
}

class interimpli implements CalculatorSumandSub,CalculatorMulandDiv{

@Override
public int Mul(int a, int b) {
	// TODO Auto-generated method stub
	return a*b;
}

@Override
public int Div(int a, int b) {
	// TODO Auto-generated method stub
	return a/b;
}

@Override
public int sum(int a, int b) {
	// TODO Auto-generated method stub
	return a+b;
}

@Override
public int sub(int a, int b) {
	// TODO Auto-generated method stub
	return a-b;
}
}
public class Inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalImp ci = new CalImp();
		System.out.println(ci.sub(50, 30));
		System.out.println(ci.sum(10, 30));
	}
}







