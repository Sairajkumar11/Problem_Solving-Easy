package tasksAssigned;

public class UglyNumber {
	
	public boolean isUglyNum(int num) {
		while(num>0) {
			if(num==1) 
				return true;
			if(num%2==0)
				num/=2;
			else if(num%3==0)
				num/=3;
			else if(num%5==0)
				num/=5;
			else
				break;
		}
		return false;
	}

	public static void main(String[] args) {

		if(new UglyNumber().isUglyNum(15)) {
			System.out.println("Ugly Number");
		}
		else
			System.out.println("Not a Ugly Number");

	}

}
