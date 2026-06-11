import java.io.*;

public class NestedIf {
    public static void main(String args[])throws IOException{

        int age ;
        int weight ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your age ");
        age = Integer.parseInt(br.readLine());

        System.out.println("Enter your weight: ");
        weight = Integer.parseInt(br.readLine());
        
        if (age >= 18 ){
            if ( weight >= 40 ){
                System.out.println("Your eligible to donate blood. Please fill in the details at reception");
            }
        }
    }    
}
