// StringSearch.java

class StringSearch
{
	public static void main (String[] args)
	{
		String[] books  = { "Java in easy steps", "XML in easy steps",
		"SQL in easy steps","CSS in easy steps", "Gone With the Wind", 
	 	"Drop the Defense" };

		int counter_1 = 0, counter_2 = 0, counter_3 = 0;

        System.out.println("\nBook subjects found:\n");

		for (int i = 0; i < books.length; i++)
		{ 
            System.out.print("| ");
			System.out.print(books[i].substring(0,4) + " | ");
			if (books[i].endsWith("in easy steps")) counter_1++;
			if (books[i].startsWith("Java")) counter_2++;
			if (books[i].indexOf("easy") == -1) counter_3++;
		}

		System.out.println("\n\nFound " + counter_1 + " titles from \"in easy steps\" series");
		System.out.println("Found " + counter_2 + " Java title");
		System.out.println("Found " + counter_3 + " other titles\n");
	}
}

