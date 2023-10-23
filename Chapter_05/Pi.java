// Pi.java

class Pi
{
	public static void main (String[] args)
	{
		float radius = Float.parseFloat(args[0]);

        /* Math.PI stores the value of Pi
           as a double with 15 decimal places */
		float shortPi = (float) Math.PI;

		float circ = shortPi * (radius + radius);   
		float area = shortPi * (radius * radius);   

		System.out.print("With Pi commuted from " + Math.PI);
		System.out.println(" to " + shortPi + "...");

		System.out.println("\tA circle of radius " + radius + " cm");
		System.out.println("\tHas a circumference of " + circ + " cm");
		System.out.println("\tAnd an area of " + area + " sq.cm");
	}
}

