package hello;
class AgeInvalidException extends Exception{
	AgeInvalidException(String s){
		super(s);
	}
}

class AgeValidation{
	void ageVerify(int age) throws AgeInvalidException {
		if(age>=18) {
			System.out.println("right to vote");
		}
		else {
			throw new AgeInvalidException("no right to vote");
		}
	}
}

public class userexcept {

	public static void main(String[] args) throws AgeInvalidException {
		// TODO Auto-generated method stub
		AgeValidation av = new AgeValidation();
		av.ageVerify(81);
	}

}
