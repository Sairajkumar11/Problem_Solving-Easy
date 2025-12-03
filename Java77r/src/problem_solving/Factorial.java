package problem_solving;

public class Factorial {

	public static void main(String[] args) {
		
		int num=7,fact=1;
		while(num!=0) {
			fact*=num;
			num--;
		}
		System.out.println(fact);

	}

}
