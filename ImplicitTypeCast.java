// Typecasting type 1 : Widening / Implicit (smaller to larger type)

public class ImplicitTypeCast {
    public static void main(String args[]){
        int a = 100 ;
        float f = a ;
        double d = f ;

        System.out.println("Integer value is " +a);
        System.out.println("Float value is " +f);
        System.out.println("Double value is " +d);
    }
}
