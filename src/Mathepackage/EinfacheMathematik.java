package Mathepackage;

public class EinfacheMathematik {
    public static void main(String[] args) {
        //int a = 1, b = 5, c = 9;
        //double d = 1.4,e = 5.6 ,f = 9.5;
        //System.out.println("int max dreier Zahlen: "+ maxDreierZahlen(a, b, c));
        //System.out.println("double max dreier Zahlen: "+ maxDreierZahlen(d, e, f));
        //System.out.println("Fakultät: "+ fakultatn(30));
        //System.out.println(ggT(59345, 2930));
        rekursionDemo(10);
    }

    public static int maxDreierZahlen(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        return max;
        
    }
    public static double maxDreierZahlen(double a, double b, double c) {
        double max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        return max;
        
    }
    public static long fakultatn(int n) {
        long ergebnis = 1;
        while (n > 0) {
            ergebnis *= n;
            n --;
        }
        return ergebnis;
    }
    public static int ggT(int a, int b) {
        if (a == b) return a;
        if (a > b) return ggT(a-b, b);
        if (a < b) return ggT(a, b-a);
        return a;
        
    }
    public static void rekursionDemo(int tiefe) {
        if (tiefe < 1) {
            System.out.println("Abbruch Tiefe: "+tiefe);
            return;
        } else {
            System.out.println("geht weiter. Tiefe: "+tiefe);
            rekursionDemo(tiefe-1);
            return;
        }
    }

}
