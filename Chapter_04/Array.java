// Array.java

class Array
{
    public static void main (String[] args)
    {
        String[] str = {"Much ", "More ", "Java "};
        int[] num = new int[3];

        num[1] = 10;
        num[2] = 20;
        str[1] = "Better ";

        System.out.println("String array length is: " + str.length);
        System.out.println("Integer array length is: " + num.length);
        System.out.println("String array: " + str[0] + str[1] + str[2]);
        System.out.println("Integer array: " + num[0] + ", " + num[1] + ", " + num[2]);
        
    }
}

