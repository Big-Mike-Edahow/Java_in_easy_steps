// CharacterSwap.java

class CharacterSwap
{
	public static void main (String[] args)
	{
		String text = "";

		if (text.isEmpty()) text = "     Borrocudo     ";

		System.out.println("\nString:    " + text);
		System.out.println("String Length:\t" + text.length() + "\n");

		text = text.trim();
		System.out.println("String Trimmed:\t" + text);
		System.out.println("String Length:\t" + text.length() + "\n");

		char initial = text.charAt(0);
		System.out.println("First Letter:\t" + initial);

		initial = text.charAt((text.length() -1));
		System.out.println("Last Letter:\t" + initial + "\n");

		text = text.replace('o','a');
		System.out.println("Chars Replaced:\t" + text + "\n");
	}
}

