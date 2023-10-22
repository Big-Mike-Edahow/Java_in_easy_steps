// DoWhile.java

class DoWhile
{
    public static void main (String[] args)
    {
        int num = 0;

        do
        {
            System.out.println("Do...While Countup: " + num);

            num += 10;
        }
        while (num <= 100);
    }
}

