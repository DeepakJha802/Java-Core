package Telusko;

class Calculator
{
    int a;

    public int toAdd(int n1 , int n2)
    {
        int result = n1 + n2;
        System.out.println("This is the addition of two number.");
        return result;
    }
}

public class Demo
{
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 20;

        Calculator calc = new Calculator();

        int ans = calc.toAdd(num1, num2);
        System.out.println(ans);
    }
}
