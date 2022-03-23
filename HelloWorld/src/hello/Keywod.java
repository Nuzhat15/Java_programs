package hello;

class important{
int empno;
double salary;
String name;

important(int empno, double salary, String name){
	//LHS=RHS-->name collision-->this
	//this.empno -->instance variable
	this.empno = empno;
	this.salary = salary;
	this.name = name;
}
void display() {
	System.out.println(empno+""+salary+""+name);
}
public class Keyword {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	important c = new important(101,40000,"nuzhat");
	c.display();
	
}

}}



