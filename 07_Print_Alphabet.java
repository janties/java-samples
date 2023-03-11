// Prints Japanese Katakana Alphabet if your pc supports that unicode
public class Print_Alphabet
{
    public static void main(String[] args)
    {
        for(char c = 0x30A0; c <= 0x30FF; c++)
            System.out.print(c+ ", ");
    }
}
