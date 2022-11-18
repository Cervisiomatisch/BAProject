package de.baleipzig.helloGame;
/*
 * Verwaltung blockierter Felder bis auffinden des komletten Fahrzeugs
 * */
import HelloObjekte.Fahrzeuge;

import java.util.ArrayList;

public class Pannenfahrzeug extends Fahrzeuge {
    // neu fuer unser Stauspiel
    private ArrayList<String> blockierteAbschnitte;

    // neu fuer unser Stauspiel
    public void setBlockierteAbschnitte(ArrayList<String> ort) {
        //TASK 8: weisen Sie den von der Hilfsklasse ermittelten
        //und übergebenen Pannenfahrzeugort der passenden Instanzvariable des Objektes zu
        //...
    }

    public String testeDichSelbst(String testFeld) {
        String result = "freier Abschnitt";
        int index = blockierteAbschnitte.indexOf(testFeld);
        if (index >= 0) {
            blockierteAbschnitte.remove(index);
            if (blockierteAbschnitte.isEmpty()) {
                result = "Pannenfahrzeug komplett gefunden";
            } else {
                result = "blockierter Abschnitt gefunden";
            }
        }
        return result;

    }
}
