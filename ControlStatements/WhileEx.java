import java.io.*;

public class WhileEx {
    public static void main(String args[]) throws IOException
    {
        int i ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number: ");
        i = Integer.parseInt(br.readLine());

        while ( i <= 20 ){
            System.out.println(i);
            i++;
        }

    }
    
}
