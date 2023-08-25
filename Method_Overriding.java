import java.util.Scanner;


class For_Overriding                        // Parent Class
{
    public int add(int n1 , int n2)
    {
        return (n1 + n2);
    }
}
class Overriding extends For_Overriding      // Child Class
{
    public int add(int n1 , int n2)
    {
        return (n1 + n2);
    }
}

public class Method_Overriding
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int n2 = sc.nextInt();

        Overriding ob = new Overriding();
        int n = ob.add(n1, n2);
        System.out.println("Addition : " + n);
    }
}

//  When a child class has same method name and signature as parent class that is called method overriding.
