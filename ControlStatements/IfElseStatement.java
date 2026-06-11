import java.io.*;

public class IfElseStatement {
    public static void main(String args[])throws IOException {
        int num;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number :");
        num = Integer.parseInt(br.readLine());

        if ( num % 2 == 0)
        {
            System.out.println("Number you entered is even.");
        }
        else{
            System.out.println("Number you entered is odd.");
        }
    }   
}
