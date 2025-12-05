package problem_solving;

public class VowelsInStrNotRepeated {

	public static void main(String[] args) {

		String str="Jacksparrow",str1="",str2="";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
				str1=str1+str.charAt(i);
			}
		}
		for(int i=0;i<str1.length();i++) {
			int count=0;
			for(int j=i;j<str1.length();j++) {
				if(str1.charAt(i)==str1.charAt(j)) {
					count++;
				}
			}
			if(count==1)
				str2=str2+str1.charAt(i);
		}
		System.out.println(str2);
	}

}
