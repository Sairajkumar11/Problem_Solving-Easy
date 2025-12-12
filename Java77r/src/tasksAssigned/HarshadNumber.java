package tasksAssigned;

public class HarshadNumber {

	public boolean isHarshNum(int num) {
		int sum=0,temp=num;
		while(num!=0) {
			sum=sum+(num%10);
			num/=10;
		}
		return temp%sum==0;
	}
	
	public static void main(String[] args) {

		if(new HarshadNumber().isHarshNum(15)) {
			System.out.println("Harshad Number");
		}
		else
			System.out.println("Not a Harshad Number");

	}

}
