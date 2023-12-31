// Switch.java

class Switch
{
    public static void main (String[] args)
    {
        int month = 10;
        int year = 2023;
        int num = 31;

        switch (month)
        {
            case 4 : num = 30; break;
            case 6 : num = 30; break;
            case 9 : num = 30; break;
            case 11 : num = 30; break;

            case 2 : num = (year % 4 == 0) ? 29 : 28; break;
        }

        System.out.println(month + "/" + year + ": " + num + "days.");
    }
}

