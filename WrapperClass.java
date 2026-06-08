import java.io.*;
public class WrapperClass {
    public static void main(String args[])throws IOException
    {
        int i , j , k ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter value of i : ");
        i = Integer.parseInt(br.readLine());

        System.out.println("Enter value of j: ");
        j = Integer.parseInt(br.readLine());

        k = i + j;
        System.out.println("Addition of i and j is " +k);
    }
}
