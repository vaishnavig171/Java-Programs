public class MathematicalEx {
    public static void main(String args[]){
        double x = 28;  double y = 4;   double z = 79.52;
        double a = 83.56;   double b = 2.0;

        System.out.println("Maximum number of x and y is: " +Math.max(x,y) +"\n");
        System.out.println("Minimum number of x and y is: "+Math.min(x,y) +"\n");
        System.out.println("Square root of y is: " +Math.sqrt(y) +"\n");
        System.out.println("Exp of a is: " +Math.exp(a) +"\n");
        System.out.println("Absolute value of x is: " +Math.abs(x) +"\n");
        System.out.println("Round of decimal number to the nearest value of z : " +Math.round(z) +"\n");
        System.out.println("Find smallest integer value that is greater or equal to a: " +Math.ceil(a) +"\n");
        System.out.println("Find largest integer value that is less than or equal to a: " +Math.floor(a) +"\n");
        System.out.println("Power of x and y is: " +Math.pow(x,y)); //return 28 power of 4 i.e.,28*28*28*28
    }
}
