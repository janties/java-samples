public class MethodArgs2
{
    static void change(int x, int new_value)
    {
        x = new_value;
    }

    public static void main(String[] args)
    {
        int x = 666;
        change(x, 42);
        System.out.print("Value of Primitive: "+x);// 666
        // It didn't change like in first ex:/
    }
}
