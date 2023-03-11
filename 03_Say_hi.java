import java.util.*;

public class Say_hi{
    public static void main(String[] args)
    {
        String name;
        Scanner s = new Scanner(System.in);
        System.out.println("May i know your name? ");
        name = s.nextLine();
        System.out.println("Welcome " + name+ "!");
        s.close();
    }
}
