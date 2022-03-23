package hello;

class College{
	int regno;
	String name;
	static String colzname = "IIT";
public College(int regno, String name) {
		
		this.regno = regno;
		this.name = name;
		
}

void change(String colzname) {
	College.colzname = colzname;
}
void display() {
	System.out.println(regno+" "+name+" "+colzname);
}
}
public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College c1 = new College(101,"kk");
		c1.colzname="NIIT";
		College c2 = new College(102,"pp");
		College c3 = new College(103,"oo");
		c1.display();
		c2.display();
		c3.display();
		
		
		
	}

}
