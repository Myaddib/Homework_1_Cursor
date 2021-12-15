package basic.java_cursor_education;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x,y,a,w,b,e;
    //    String p1,p2,p3,p4;
        x = 3;
        y = 6;
        a = 7;
        w = 8;
        b = 10;
        e = 5;

        System.out.println("Homework №1 CURSOR. EDUCATION, Dmitry Porva");

        //    x+y-a/2*(x+w)
        String p1 =  x+"+"+y+"-"+a+"/"+2+"*"+"("+x+"+"+w+")=";
        System.out.print(p1);
        System.out.println(x+y-a/2*(x+w));

        //    a*(x+x)/y-a*3
        String p2 = a+"*"+"("+x+"+"+x+")/"+y+"-"+a+"*"+3+"=";
        System.out.print(p2);
        System.out.println( a*(x+x)/y-a*3);

        //    a+b/x-y
        String p3 = a+"+"+b+"/"+x+"-"+y+"=";
        System.out.print(p3);
        System.out.println(a+b/x-y);

        //    X-e/2%e+1
        String p4 = x+"-"+e+"/"+2+"%"+e+"+"+1+"=";
        System.out.print(p4);
        System.out.println(x-e/2%e+1);
    }
}
