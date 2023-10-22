// Option.java

class Option
{
    public static void main (String[] args)
    {
        if (args[0].equals("-en"))
        {
            System.out.println("\nEnglish Option.\n");
        }
        else if (args[0].equals("-es"))
        {
            System.out.println("\nSpanish Option.\n");
        }
        else
        {
            System.out.println("\nUnrecognized Option.\n");
        }
    }
}

