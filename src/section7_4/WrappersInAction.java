package section7_4;

public class WrappersInAction {
	
	public static void main(String[] args) {
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("Wrappers have a field that stores MIN value.");
        System.out.println("For example, the MIN_VALUE for byte is: " + byteMin);
                
        short shortMax = Short.MAX_VALUE;
        System.out.println("Wrappers also have a field that stores MAX value.");
        System.out.println("For example, the MAX_VALUE for short is: " + shortMax);
                
        String intToString = Integer.toString(2022);
        System.out.println("You can convert Wrapper values to String as you wish.");
        System.out.println("In the above example, " + intToString + " is a String now.");
                
        String report = "World population has reached <8000000000> people.";
        long population = Long.parseLong( report.substring(report.indexOf('<') + 1, report.indexOf('>')) );
        System.out.println("Wrappers have <Type>.valueOf() and parse<Type>() methods ");
        System.out.println("which allow converting String into the Wrapper type as needed.");
        System.out.println("In the above example, we're extracting and converting the world population ");
        System.out.println("on a single line, which is " + population);
                
        float smaller = Float.min(4.3901F, 4.3902F);
        System.out.println("Wrappers also have some methods that utilize other preexisting methods.");
        System.out.println("Such as <Type>.min() method will tell you which of the two types is smaller.");
        System.out.println("By utilizing Math.min() internally, thus the smaller floating value is: " + smaller);
                
        double larger = Double.max(4.3901d, 4.3902d);
        System.out.println("And <Type>.max() is another such method, returning the larger of two values.");
        System.out.println("In the Double example above, we'll get: " + larger);
                
        Character symbol = '&';
        System.out.println("There are certain special methods that do specific actions.");
        System.out.println("For example, Character.isDigit() will return 'true' ");
        System.out.println("if the value passed as an argument is between 0 and 9.");
        System.out.println("Is symbol a number? " + Character.isDigit(symbol));
        symbol = '8';
        System.out.println("Is updated symbol a number? " + Character.isDigit(symbol));
                
        boolean a = Boolean.TRUE;
        System.out.println("You can also assign values to primitives using Wrapper predefined values.");
        System.out.println("For example, our 'a' boolean holds value: " + a);
        System.out.println("We can also use the same principle to utilize values on the fly.");
        System.out.println("In this example, we don't need to declare a boolean to display " + Boolean.FALSE);
    }

}
