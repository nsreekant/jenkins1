import java.util.*;

public class someexample{	
	final char MY_CONST = 'b';	//non static declaration - not a common practice for final (constants)
	//static final char MY_CONST='c'; static declaration
	//public static final char MY_CONST='c';  public static declaration
	
	public static void main(String args[]){
	
	String str1 = "";
	int counter=0;
	
	someexample abc = new someexample(); // instantiating for non-static constant value
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the value:");
	
	str1 = scan.next();
	
		for(int j=0;j<str1.length();j++){
			//if (str1.charAt(j)=MY_CONST){
			//	if ((MY_CONST).equals(str1.charAt(j))){			// comparing a String object
			//MY_CONST val1 = new MY_CONST();
			
			//abc.MY_CONST='b';
				if (str1.charAt(j)==abc.MY_CONST){					// comparing a primitive char
				counter=++counter;
				}
		}
		System.out.println("Count of the " + abc.MY_CONST +  " is :" + counter);
	}
}