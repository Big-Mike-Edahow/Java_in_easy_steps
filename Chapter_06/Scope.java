// Scope.java

class Scope
{
	String text = "This is a global variable of the Scope class";

	public static void main (String[] args)
	{
		String text = "This is a local variable in the main method";
		System.out.println("\n" + text);
		sub();
	}

	public static void sub( )
	{	
		String text = "This is a local variable in the sub method";	
		System.out.println(text + "\n");
	}
}

