package problem_solving;

public class VowelsInStrInRevOrder {

	public static void main(String[] args) {

		String str="JackspArrow";
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			System.out.print(str.charAt(i));
		}

	}

}
