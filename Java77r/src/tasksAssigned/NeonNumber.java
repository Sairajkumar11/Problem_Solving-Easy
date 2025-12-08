package tasksAssigned;

public class NeonNumber {
	
	public boolean isNeon(int num) {
		int square=num*num,sum=0;
		while(square!=0) {
			sum=sum+square%10;
			square/=10;
		}
		return num==sum;
	}

	public static void main(String[] args) {
		
		if(new NeonNumber().isNeon(9)) {
			System.out.println("Neon Number");
		}
		else {
			System.out.println("Not a Neon Number");
		}
	}

}
