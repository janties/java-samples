public class MethodArgs
{
    static void clean(int A[])
    {
        int i = 0;
        int len = A.length;
        while (i < len)
        {
            A[i] = 0;
            i++;
        }
    }

    static void print(int A[])
    {
        for(int x : A)
            System.out.print(x+", ");
        System.out.println();//newline
    }

    public static void main(String[] args)
    {
        int A[] = { 2, 3, 4, 5, 6};
        print(A);//Before 2, 3, 4, 5, 6,
        clean(A);
        print(A);//After  0, 0, 0, 0, 0,
    }
}
