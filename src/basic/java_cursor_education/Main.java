package basic.java_cursor_education;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int x, y, a, w, b, X, e;

        int res_int_1, res_int_2, res_int_3, res_int_4;


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
        res_int_1 = x + y - a / 2 * (x + w);
        System.out.print("(int) " + res_int_1);

        //_2    a*(x+x)/y-a*3
        String p2 = a + "*" + "(" + x + "+" + x + ")/" + y + "-" + a + "*" + 3 + "=";
        System.out.print(p2);
        res_int_2 = a * (x + x) / y - a * 3;
        System.out.print("(int) " + res_int_2);

        //_3    a+b/x-y
        String p3 = a + "+" + b + "/" + x + "-" + y + "=";
        System.out.print(p3);
        res_int_3 = a + b / x - y;
        System.out.print("(int) " + res_int_3);

        //_4    X-e/2%e+1
        String p4 = X + "-" + e + "/" + 2 + "%" + e + "+" + 1 + "=";
        System.out.print(p4);
        res_int_4 = X - e / 2 % e + 1;
        System.out.print("(int) " + res_int_4);

    }
}
