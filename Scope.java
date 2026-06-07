public class Scope {

    int instanceVar = 10;          // Instance Variable
    static int staticVar = 20;     // Static Variable

    public void display() {
        int localVar = 30;         // Local Variable

        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }
    public static void main(String[] args) {
        Scope obj = new Scope();
        obj.display();
    }
}