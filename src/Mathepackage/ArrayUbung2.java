package Mathepackage;

import java.util.Arrays;

public class ArrayUbung2 {

    public static void main(String[] args) {
        double[][] matrixA =    {{1.0, 2.0, 3.0},
                                 {1.0, 2.0, 3.0},
                                 {2.0, 4.0, 8.0}};
        double[][] matrixB =    {{4.0, 5.0, 6.0},
                                 {4.0, 5.0,6.0}};
        double[][] matrixC =    {{4.0, 5.0, 6.0},
                                 {4.0, 5.0,6.0},
                                 {4.0, 5.0, 6.0}};
        //System.out.println(Arrays.deepToString(matrizenmultiplikation(matrixA, matrixC)));
        //System.out.println(Arrays.deepToString(matrixTrans(matrixA)));
        String[] StringArray = {"Integer","Boolean","Character","Long","Double","Float","Short","Byte"};
        Arrays.sort(StringArray);
        System.out.println(Arrays.deepToString(StringArray));
        char Zeichen1 = '8';
        char Zeichen2 = 'x';
        System.out.println(Character.isDigit(Zeichen1));
        System.out.println(Character.isDigit(Zeichen2));



    }
    public static double[][] matrixTrans(double[][] matrix1) {
        int zeilen = matrix1.length;
        int spalten = matrix1[0].length;
        double[][] transponiert = new double[spalten][zeilen];

        for (int i = 0; i<zeilen; i++) {
            for (int j = 0; j<spalten; j++) {
                transponiert[j][i] = matrix1[i][j];
            }
        }
        return transponiert;
    }


    public static double[][] matrizenaddition(double[][] matrix1, double[][] matrix2) {
        int zeilen = matrix1.length;
        int spalten = matrix1[0].length;
        double[][] ergebnis = new double[zeilen][spalten];

        for (int i = 0; i< spalten; i++){
            for (int j = 0; j<zeilen; j++){
                ergebnis[j][i] = matrix1[j][i] + matrix2[j][i];
            }
        }
        return ergebnis;
    }
    public static double[][] matrizenmultiplikation(double[][] matrix1, double[][] matrix2) {
        int zeilen = matrix1.length;
        int spalten = matrix2[0].length;
        int komponente = matrix1[0].length;
        double[][] ergebnis = new double[zeilen][spalten];

        for (int i = 0; i< spalten; i++){
            for (int j = 0; j<zeilen; j++){
                for (int x = 0; x<komponente; x++)
                    ergebnis[j][i] += matrix1[j][x] * matrix2[j][i];
            }
        }
        return ergebnis;
    }
}
