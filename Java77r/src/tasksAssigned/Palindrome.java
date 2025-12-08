package tasksAssigned;

public class Palindrome {
	
	public boolean isPalindrome(int num) {
		int temp=num,rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num/=10;
		}
		return rev==temp;
	}

	public static void main(String[] args) {

		if(new Palindrome().isPalindrome(1221)) 
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");

	}

}
