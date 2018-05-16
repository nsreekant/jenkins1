import java.util.*;

public class charCount{
	public static void main(String[] args){
		String str1="";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string value");
//		str1 = scan.nextLine();
		str1 = scan.next();
	//	System.out.println("String length"+str1.length());
		int counter=0;
		for(int i=0;i<str1.length();i++)
		{
	//		System.out.println("String value "+str1.charAt(i));
			if (str1.charAt(i)=='$') {
	//			System.out.println("String value entered "+str1.charAt(i));
				counter = counter + 1;
	//			System.out.println("counter value is "+ counter);
			}
		}
		System.out.println("Value of $ is :" + counter);
	}
}