public class WrapperClassDemo {
    public static void main(String[] args) {

/*     +++++++++++++++++++++++++++++++
        Predefine Wrapper Class
        Boolean     boolean;
        Byte        byte;
        Short       short;
        Character   char;
        Integer     int;
        Float       float;
        Double      double;
        Long        long;
        +++++++++++++++++++++++++++++++*/

        //convert primitive to object
        //Integer number = new Integer(20); 'Integer(int)' is deprecated and marked for removal
        Integer number2 = Integer.valueOf(20);
        Integer fromString = Integer.valueOf("30");
        Integer directFromPrimitive = 40;

        System.out.println("number2 = " + number2);
        System.out.println("fromString = " + fromString);
        System.out.println("directFromPrimitive = " + directFromPrimitive);

        // Convert object to primitive
        int num1 = number2.intValue();
        double num2 = number2.doubleValue();

        //boxing and unboxing
        Long longValue = Long.valueOf(9760514942L);     //boxing
        long anotherVariable = longValue.longValue();       //unboxing

        //autoboxing and auto-unboxing
        Double doubleValue = 45.99;                 //auto-boxing
        double doubleVariable = doubleValue;        //auto-unboxing

        Boolean var1 = Boolean.valueOf(true);
        Boolean var2 = Boolean.valueOf(false);

        Boolean var3 = Boolean.valueOf("true");
        Boolean var4 = Boolean.valueOf("false");
        Boolean var5 = Boolean.valueOf("TrUe");     // only for true value it will print true,no matter whether it is uppercase or lowercase

        System.out.println("var5 = " + var5);
        System.out.println("var4 = " + var4);
        System.out.println("var3 = " + var3);

        Character c1 = Character.valueOf('c');
        char c3 = c1;
        Character c4 = 'm';


    }
}
