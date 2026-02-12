public class StringTrimEx {
    public static void main(String[] args) {
        String S1 = "  Hello World by java ";
        System.out.println(S1.length());
        System.out.println(S1);//before trim
        String tr = S1.trim();
        System.out.println(tr.length());
        System.out.println(tr);//after trim

    }
}
