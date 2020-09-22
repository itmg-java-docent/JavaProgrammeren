package strings;

public class StringPool {

    public static void main(String[] args) {
        String a = new String("bla");
        String b = a.intern();
        System.out.println(a==b);
        System.out.println(a+" "+b);
    }
}
