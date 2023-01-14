package shorts;

public class String_startsWith_endsWith {
    public static void main(String[] args) {


        String url = "www.amazon.com";

        boolean r1 = url.startsWith("www.");  // will return true
        System.out.println(r1);
        boolean  r2 = url.endsWith (".com"); // will return true
        System.out.println(r2);


    }
}
