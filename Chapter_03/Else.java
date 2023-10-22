// Else.java

class Else
{
    public static void main (String[] args)
    {
        int hours = 21;
        
        if (hours < 12)
        {
            System.out.println("Good morning. The hour is: " + hours + ":00.\n");
        }
        else if (hours < 18)
        {
            System.out.println("Good afternoon. The hour is: " + hours + ":00.\n");
        }
        else
        {
            System.out.println("Good evening. The hour is: " + hours + ":00.\n");
        }
    }
}


