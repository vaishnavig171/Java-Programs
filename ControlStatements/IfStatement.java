import java.io.*;

class IfStatement {
    public static void main(String args[])throws IOException{
        int age ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your age : ");
        age = Integer.parseInt(br.readLine());

        if(age > 15 )    //checking age
        {
            System.out.println("Your age is " + age + " . You are greater than 15");
        }
    }
}
