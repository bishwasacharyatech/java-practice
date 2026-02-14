public class StringLiteralex {
    public static void main(String[] args)
    {
        String S1 = "Hello World";
        char[] ch = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
        String S2 = new String(ch);
        String S3 = new String("java");


        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S3);
    }
}
