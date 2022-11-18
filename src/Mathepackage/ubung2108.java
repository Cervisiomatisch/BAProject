package Mathepackage;

import java.lang.Math; 
public class ubung2108 {
    public static void main(String[] args) {
        Wochentage();

    }

    public static void ifelse() {
        int a = 1, b = 2, c = 1;
        if (a == b) {
            if (b == c) {
                System.out.println("Alle Zahlen sind gleich");
            } else {
                System.out.println("Zahlen sind nicht gleich");
            }        
        }
        else {
            System.out.println("Zahlen sind nicht gleich");
        }
    }
    public static void KopfoderZahl() {
        int ergebnis;
        double z;
        z = Math.random();
        ergebnis = (int) Math.round(z);

        if (ergebnis == 0){
            System.out.println("Kopf");
        } else {
            System.out.println("Zahl");
    }

    }
    public static void switchanweisung() {
        int Jahreszeit = 1;
        switch (Jahreszeit) {
            case 0:
                System.out.println("Frühling");
                break;
            case 1:
                System.out.println("Sommer");
                break;
            case 2:
                System.out.println("Herbst");
                break;
            case 3:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Ungültig");
            
        }
    }
    public static void forwiederholung() {
        int ergebnis = 0;
        for (int i=0; i<100; i++ ) {
            if (i %2 == 1) {
                ergebnis += i; 
            }
        }
        System.out.println(ergebnis);
    }

    public static void whilewiederholung() {
        int n = 123456, m = 0;
        while (n != 0) {
            m = (10 * m) + (n%10);
            n = n / 10;
        }
        System.out.println(m);
    }
    public static void forubunggerade() {
        for(int i = 0; i<= 20; i += 2){
            System.out.println(i);
        }
    }


    public static void forubung1024() {
        for (int i = 1; i<= 1024; i *= 2) {
            System.out.println(i);
        }
    }
    public static void Wochentage() {
        for(int i = 1; i<= 3; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.println("Woche "+i+", Tag "+j);
            }
        }
        
    }

}

