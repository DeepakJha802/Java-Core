import java.*;


public class Addition
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = add(a, b);
    }
    public static int add(int a, int b)
    {
        return a + b;
    }
}
