public class readFromArgs{
	public static void main(String args[]){
		int counter=0;
		for(String argument: args)
			{
				//System.out.println(argument);
				//System.out.println(argument.length());
				for(int i=0;i<argument.length();i++){
					if (argument.charAt(i)=='$')
					{
						counter=++counter;
					}
				}
			}
			//System.out.println("Testing: " + args[i]);
			System.out.println("Counter : " + counter);
		}
}