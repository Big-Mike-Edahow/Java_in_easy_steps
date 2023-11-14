// Sort.java

import java.util.Arrays ;

class Sort
{
	public static void main (String[] args)
	{
		String[] names = {"Mike", "Jared", "Steve", "Gabe"} ;
		int[] nums = {200, 300, 100, 400} ;

        System.out.print("\n");
		display(names);
		display(nums);

		Arrays.sort(names);
		Arrays.sort(nums);

		display(names);
		display(nums);
        System.out.print("\n");
	}

	public static void display(String[] elems)
	{
		System.out.println("\nString Array:");
		for(int i = 0; i < elems.length; i++)
		System.out.println("Element " +i+ " is " + elems[i]);
	}

	public static void display(int[] elems)
	{
		System.out.println("\nInteger Array:");
		for( int i = 0; i < elems.length; i++ )
		System.out.println("Element " +i+ " is " + elems[i] );
	}
}

