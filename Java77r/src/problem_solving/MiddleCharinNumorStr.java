package problem_solving;

public class MiddleCharinNumorStr {

	public static void main(String[] args) {

		String s="Sigma";
		int len=s.length();
		if(len%2==0)
			System.out.println(s.charAt((len/2)-1)+""+s.charAt(len/2));
		else
			System.out.println(s.charAt(len/2));
		

	}

}
