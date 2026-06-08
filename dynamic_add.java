/* In this program the output is combined together 
i.e. if input of i is 10 input of j is 10 , it combines both 
and give o/p 1010 as the datatype of i and j is String by default.
To solve this problem Wrapper class is used */
import java.io.*;

public class dynamic_add {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter value of i: ");
        String i = br.readLine();

        System.out.println("Enter value of b: ");
        String j = br.readLine();

        String k = i + j ;
        System.out.println("Addition is: " +k);    //Output is the combined together as the java takes String datatype by default
    }
}
