package problem_solving;

public class SumOfTheDigits {

	public static void main(String[] args) {
		
		int num=1322,sum=0;
		while(num!=0) {
			int n=num%10;
			sum=sum+n;
			num/=10;
		}
		System.out.println(sum);
		
	}

}
