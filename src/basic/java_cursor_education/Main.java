package basic.java_cursor_education;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int x, y, a, w, b, X, e;

        int res_int_1, res_int_2, res_int_3, res_int_4;
        float res_float_1, res_float_2, res_float_3, res_float_4;
        double res_double_1, res_double_2, res_double_3, res_double_4;
        short res_short_1, res_short_2, res_short_3, res_short_4;
        byte res_byte_1, res_byte_2, res_byte_3, res_byte_4;

        //    String p1,p2,p3,p4;
        x = 3;
        y = 6;
        a = 7;
        w = 8;
        b = 10;
        X = 10;
        e = 5;

        System.out.println("Homework №1 CURSOR. EDUCATION, Dmitry Porva");

        //_1    x+y-a/2*(x+w)
        String p1 = x + "+" + y + "-" + a + "/" + 2 + "*" + "(" + x + "+" + w + ")=";
        System.out.print(p1);
        //System.out.println(x+y-a/2*(x+w));
        res_int_1 = x + y - a / 2 * (x + w);
        res_float_1 = x + y - a / 2 * (x + w);
        res_double_1 = x + y - a / 2 * (x + w);
        // res_short_1 = x+y-a/2*(x+w); error
        // res_byte_1 = x+y-a/2*(x+w); error

        System.out.print("(int) " + res_int_1);
        System.out.print(" (float) " + res_float_1);
        System.out.println(" (double) " + res_double_1);
        //System.out.println(" (double) "+res_short_1);
        //System.out.println(" (double) "+res_byte_1);

        //_2    a*(x+x)/y-a*3
        String p2 = a + "*" + "(" + x + "+" + x + ")/" + y + "-" + a + "*" + 3 + "=";
        System.out.print(p2);
        //System.out.println( a*(x+x)/y-a*3);
        res_int_2 = a * (x + x) / y - a * 3;
        res_float_2 = a * (x + x) / y - a * 3;
        res_double_2 = a * (x + x) / y - a * 3;
        // res_short_2 = a*(x+x)/y-a*3; error
        // res_byte_2 = a*(x+x)/y-a*3; error

        System.out.print("(int) " + res_int_2);
        System.out.print(" (float) " + res_float_2);
        System.out.println(" (double) " + res_double_2);
        //System.out.println(" (double) "+res_short_2);
        //System.out.println(" (double) "+res_byte_2);


        //_3    a+b/x-y
        String p3 = a + "+" + b + "/" + x + "-" + y + "=";
        System.out.print(p3);
        //System.out.println(a+b/x-y);
        res_int_3 = a + b / x - y;
        res_float_3 = a + b / x - y;
        res_double_3 = a + b / x - y;
        // res_short_3 =a+b/x-y; error
        // res_byte_3 =a+b/x-y; error

        System.out.print("(int) " + res_int_3);
        System.out.print(" (float) " + res_float_3);
        System.out.println(" (double) " + res_double_3);
        //System.out.println(" (double) "+res_short_3);
        //System.out.println(" (double) "+res_byte_3);

        //_4    X-e/2%e+1
        String p4 = X + "-" + e + "/" + 2 + "%" + e + "+" + 1 + "=";
        System.out.print(p4);
        // System.out.println(X-e/2%e+1);
        res_int_4 = X - e / 2 % e + 1;
        res_float_4 = X - e / 2 % e + 1;
        res_double_4 = X - e / 2 % e + 1;
        // res_short_4 =X-e/2%e+1; error
        // res_byte_4 =X-e/2%e+1; error

        System.out.print("(int) " + res_int_4);
        System.out.print(" (float) " + res_float_4);
        System.out.println(" (double) " + res_double_4);
        // System.out.println(" (double) "+res_short_4);
        //System.out.println(" (double) "+res_byte_4);
    }
}
