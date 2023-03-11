public class MyClass
{
    int myMethod(int x, int y)
    {
        if(x > y)
            return x;
        else
            return y;
    }

    public static void main(String[] args)
    {
        int a = 21, b = 42;
        MyClass myObj = new MyClass();
        System.out.println(myObj.myMethod(a, b));
    }
}
===========================OR===========================
public class MyClass
{
    static int myMethod(int x, int y)
    {
        return x > y ? x : y;
    }

    public static void main(String[] args)
    {
        int a = 21, b = 42;
        System.out.println(myMethod(a, b));
    }
}
