package problem_solving;

public class ReverseOfNum {

	public static void main(String[] args) {

		int num=756,rev=0;
		while(num!=0) {
			int n=num%10;
			rev=rev*10+n;
			num/=10;
		}
		System.out.println(rev);
	}

}
