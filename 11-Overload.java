public class Overload
{
    static int max(int... args)
    {
        int max = args[0];
        for (int i : args) {
            if(i > max)
                max = i;
        }
        return max;
    }

    static float max(float... args)
    {
        float max = args[0];
        for (float i : args)
        {
            if(i > max)
                max = i;
        }
        return max;
    }
    //====================================
    public static void main(String[] args)
    {
        System.out.println(max(12, 24, 42, 35));
        System.out.println(max(0.1f, -0.5f, 4.2f, 2.1f));
    }
}
