package Mathepackage;

import HelloObjekte.Fahrzeuge;
import HelloObjekte.PKW;

public class Arraysubung {
    static int[] intTestArray = new int[100];
    static Fahrzeuge[] fahrzeugTestArray = new Fahrzeuge[7];
    static int[][] hundertertafel = new int[10][10];
    static char[][] musterarray = new char[10][10];

    public static void main(String[] args) {
        MusterArray();

    }
    public static void Fahrzeuge(){
        for (int i = 0; i < 100; i++) {
            intTestArray[i] = i+1;
        }
        for (int i = 2; i<=8; i++) {
            fahrzeugTestArray[i-2] = new PKW(i);
        }
        System.out.println("Int TestArray "+ intTestArray.length);
        System.out.println("Fahrzeug TestArray "+ fahrzeugTestArray.length);
    }
    public static void Mehrdimensional() {
        //Mehrdimensional !Wichtig!
        for (int i=0; i< 10; i++) {
            for (int j=0; j< 10; j++) {
                hundertertafel[i][j] = j+1+(i*10);
                System.out.printf("%3d ",hundertertafel[i][j]);
            }
            System.out.println();
        }
    }
    public static void MusterArray() {
        for (int i = 0; i<10; i++) {
            for (int j = 0; j<10; j++) {
                if (i==0 && j == 0) {
                    musterarray[i][j] = '\\';
                } else {
                    if (i == 9 && j == 9) {
                        musterarray[i][j] = '\\';
                    } else {
                        if (j - 1 == i) {
                            musterarray[i][j] = '\\';
                        } else {
                            musterarray[i][j] = ' ';
                        }
                    }

                }
                System.out.printf("%c ",hundertertafel[i][j]);
            }
            System.out.println();
        }
    }
}
