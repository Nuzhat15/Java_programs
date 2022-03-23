package hello;

class Construct{
	int empno;
	double salary;
	String name;
	
	Construct(double bonus){
		System.out.println(salary + bonus);
	}

public class ConstructT {

	public static void main(String[] args) {
		Construct cons = new Construct(3445);
		cons.salary = 10000;

	}
}}



	

