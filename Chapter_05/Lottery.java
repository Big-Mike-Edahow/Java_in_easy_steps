// Lottery.java

class Lottery
{
	public static void main (String[] args)
	{
		int[] nums = new int[60];
			

		// Fill elements 1-59 with integers 1-59.
		for(int i = 1; i < 60; i++)
        {
            nums[i] = i;
        }
		
		// Shuffle the values in elements 1-59.
		for(int i = 1; i < 60; i++)
		{
			int r = (int) Math.ceil(Math.random() * 59) ;
			int temp = nums[i];

            nums[i] = nums[r];
            nums[r] = temp;
		}

        System.out.println("\nRandom lottery numbers:\n");

		// Display the values in elements one to six.
		for (int i = 1; i < 7; i++)
		{
			System.out.print(Integer.toString(nums[i]) + "  ");
		}

        System.out.println("\n");
	}
}

