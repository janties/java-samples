import java.util.*;

public class Get_sum
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);//s is my object
        int nbr1, nbr2, sum;
        System.out.println("Enter 2 numbers: ");
        nbr1 = s.nextInt();
        nbr2 = s.nextInt();
        sum = nbr1 + nbr2;
        System.out.println("Sum is " + sum);
        s.close();
    }
}
