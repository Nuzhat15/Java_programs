package hello;

class Bank{
	double rateOfInterest = 7.8;
}
class HDFC extends Bank{
	void interestAmount(double amount) {
			double interestamount = (amount*rateOfInterest)/100;
			System.out.println(interestamount);
	}
}

public class inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC hdfc = new HDFC();
		hdfc.interestAmount(10000);
	}

}
