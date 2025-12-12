package tasksAssigned;

public class PrimeNumber {

	public static boolean isPrimeorNot(int num) {
		if(num==1)
			return false;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {

		if(isPrimeorNot(1012))
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");

	}

}
