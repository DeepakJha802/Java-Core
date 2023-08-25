import java.util.Scanner;

public class Method_Overloading
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        add(n1 , n2);
        add(n1 , n2 , n3);
    }
    public static int add (int n1 , int n2 , int n3)
    {
        return (n1 + n2 + n3);
    }
    public static int add (int n1 , int n2)
    {
        return (n1 + n2);
    }
}

// When two methods has same method name with different signature is called method overloading
