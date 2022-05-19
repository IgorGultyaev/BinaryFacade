public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps(); //s
        //демонстрация
        System.out.println("a + b = c");
        String a = "01011", b = "01011";
        System.out.println("a = " + a + " - двоичная");
        System.out.println("b = " + b + " - двоичная");
        System.out.println(Integer.parseInt(a, 2) + " + " + Integer.parseInt(b, 2));
        String c = bins.sum(a, b);
        System.out.println(c + " - двоичная");
        System.out.println("с = " + Integer.parseInt(c, 2));
        System.out.println();
        System.out.println("a * b = c");
        System.out.println(Integer.parseInt(a, 2) + " * " + Integer.parseInt(b, 2));
        c = bins.mult(a, b);
        System.out.println(c + " - двоичная");
        System.out.println("с = " + Integer.parseInt(c, 2));


    }
}