import java.util.Scanner;

public class NestedSwitchEx {
    public static void main(String args[]){
        //String branch ;
        //int collegeYear ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your branch :");
        String branch = sc.nextLine();

        System.out.println("Enter your College Year: ");
        int collegeYear = sc.nextInt();

        switch (collegeYear) 
        {
            case 1:
                System.out.println("English, Chemistry, Physics, Maths");
                break;
        
            case 2:
               switch (branch) 
               {
                case "CSE'":
                    System.out.println("Operating System, Java, Data Structure");
                    break;
        
                case "ECE":
                    System.out.println("Micro Processor, Logic switching theory");
                    break;
            
                case "Mechanical":
                    System.out.println("Drawing, Manufacturing Machines");
                    break;
                }
            break;
            case 3:
                switch (branch)
                {
                    case "CSE":
                        System.out.println("Computer organization, MultiMedia Techniques");
                        break;
                    case "ECE":
                        System.out.println("Fundamentals of Logic Design, Micro Electronics");
                        break;
                    case "Mechanical":
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;
                }
            break;
            case 4:
                switch (branch)
                {
                    case "CSE":
                        System.out.println("Data Communication and Networks, Multimedia");
                        break;
                    case "ECE":
                        System.out.println("Embedded System, Image Processing");
                        break;
                    case "Mechanical":
                        System.out.println("Production Technology, Thermal ENgineering");
                        break;
                }
            break;
        }
        sc.close();
    }
}
