/*
Binary      => 0,1
Decimal     => 0,1,2,3,4,5,6,7,8,9
Octal       => 0,1,2,3,4,5,6,7
Hexadecimal => 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F
*/

public class Literal
{
    public static void main(String[] args)
    {
        byte b1 = 10;    // Binary  =>      (1*(2**1) + 0)
        byte b2 = 0b1010;// Decimal =>      (1*(2**3) + 1*(2**1))
        byte b3 = 012;   // Octal   =>      (1*((2**3)**1) + 2*((2**3)**0))
        byte b4= 0XA;    // Hexadecimal =>  (A = 10)
        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);
        //=================================================================
        //long nbr = 99999999999; error: integer number too large
        long nbr = 999_999_999_999L;//999999999999
        System.out.println(nbr);
        //float f = 12.56; error:incompatible types: possible lossy conversion from double to float
        float f = 123456.56f;
        System.out.println(f);
    }
}
