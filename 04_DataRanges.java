public class DataRanges
{
    public static void main(String[] args)
    {
        String s1 = String.format("Byte(%d Byte) =>\t\t[%s, %s]", Byte.BYTES, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.println(s1);
        String s2 = String.format("Int(%d Bytes) =>\t\t[%s, %s]", Integer.BYTES, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(s2);
        String s3 = String.format("Float(%d Byte) =>\t[%s, %s]", Float.BYTES, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.println(s3);
        String s4 = String.format("Double(%d Bytes) =>\t[%s, %s]", Double.BYTES, Double.MIN_VALUE, Double.MAX_VALUE);
    System.out.println(s4);
    }
}
