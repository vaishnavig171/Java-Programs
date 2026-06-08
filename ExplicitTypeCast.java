public class ExplicitTypeCast {
    public static void main(String args[]){
        long l = 30000 ;
        byte b = (byte)l;    //explicit type casting required
        int i = (int)b;
        // dataType variableName = (dataType)variableToConvert;

        System.out.println("Long value " +l);    // Original value
        System.out.println("Byte value " +b);   // Value after casting (30000 % 256 = 48)
        System.out.println("Integer value " +i);  // Same byte value stored as int  
    }
}
