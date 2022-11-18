package Mathepackage;
import java.util.Scanner;

public class Scannerubung {

    public static void main(String[] args) {
      String getrennteZahlen = "1, 2, 3";
      Scanner scnr = new Scanner(getrennteZahlen).useDelimiter("\\s*,\\s*");
      while (scnr.hasNext()) {
          System.out.println(scnr.next());
      }
      scnr.close();


    }

    public void Scannerding() {
        Scanner unserScanner = new Scanner(System.in);
        int summe = 0;
        System.out.println("Bitte jeweils durch Leerzeichen getrennt ein paar ganze zahlen und am Ende ein x eingeben: ");
        while (unserScanner.hasNextInt()) {
            summe += unserScanner.nextInt();
        }
        System.out.printf("Summe deiner Zahlen: %,d", summe);
    }
}
