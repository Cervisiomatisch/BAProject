package de.baleipzig.helloGame;
/*
 * Hilfe
 * */
import HelloObjekte.Fahrzeuge;

import java.util.ArrayList;
import java.util.Scanner;

public class Spielhilfe extends Fahrzeuge {

    //TASK 9: sorgen Sie dafür, dass die folgende Variable alphabet
    //nicht mehr objektabhängig ist, sondern der Klasse gehört und
    //sorgen Sie außerdem dafür, dass sie konstant ist
    //... private String alphabet = "abcdefg"; -Done
    private static String alphabet = "a";
    private int rasterLaenge = 7;
    private int rasterGroesse = 49;
    private int[] raster = new int[rasterGroesse];
    private int anzahlPannenfahrzeuge = 0;
    private Scanner einScanner = new Scanner(System.in);

    public String erhalteBenutzerEingabe(String eingabe) {
        String eingabeZeile = null;
        System.out.print(eingabe + "  ");
        //TASK 10: prüfen Sie vorab, ob überhaupt die nachfolgend eingelesene netLine existiert
        //... {
        eingabeZeile = einScanner.nextLine();

        if (eingabeZeile.length() == 0) {
            return null;
        }
        return eingabeZeile.toLowerCase();
    }

    public ArrayList<String> plaziereFahrzeug(int laengeBlockade) {
        ArrayList<String> alphaBlockierteZellen = new ArrayList<String>();
        String temp = null; // Hilfsstring fuer Koordinatenzusammenfuehrung
        int[] koordinatenFuerBlockade = new int[laengeBlockade]; // Kandidantenliste fuer Koordinaten, die als Blockiert
        // markiert werden
        boolean ortFuerFahrzeugGefunden = false;
        int feldFuerBlockade = 0; // Startfeld fuer blockierte Felder

        anzahlPannenfahrzeuge++;

        // Pannenfahrzeuge abwechselnd horizontal und vertikal anordnen
        int schrittweiteZuNachbarfeld = 1; // Pannenfahrzeuge horizontal anordnen
        if ((anzahlPannenfahrzeuge % 2) == 1) {
            schrittweiteZuNachbarfeld = rasterLaenge; // Pannanfahrzeug vertikal anordnen
        }

        while (!ortFuerFahrzeugGefunden) {
            feldFuerBlockade = (int) (Math.random() * rasterGroesse); // zufaelliges Startfeld fuer Blockade
            int zaehlerAnzahlBlockierteFelder = 0;
            ortFuerFahrzeugGefunden = true;
            // benachbarte Felder vom Startfeld abchecken, bis
            // genuegend Nachbarfelder fuer Blockade gefunden
            // oder Blockade mit dem Startfeld nicht moeglich
            while (ortFuerFahrzeugGefunden && zaehlerAnzahlBlockierteFelder < laengeBlockade) {
                if (raster[feldFuerBlockade] == 0) { // wenn Feld noch frei
                    koordinatenFuerBlockade[zaehlerAnzahlBlockierteFelder] = feldFuerBlockade; // gefundenes Feld
                    // zwischenspeichern
                    zaehlerAnzahlBlockierteFelder++;
                    feldFuerBlockade = feldFuerBlockade + schrittweiteZuNachbarfeld; // Nachbarfeld testen
                    // unten ausserhalb des Rasters
                    if (feldFuerBlockade >= rasterGroesse) {
                        ortFuerFahrzeugGefunden = false;
                    }
                    // rechts ueber Rand in neue Zeile,
                    // Fahrzeug nicht mehr zusammenhaengend
                    if (zaehlerAnzahlBlockierteFelder > 0 & (feldFuerBlockade % rasterLaenge == 0)) {
                        ortFuerFahrzeugGefunden = false;
                    }
                } else { // Feld schon besetzt
                    ortFuerFahrzeugGefunden = false;
                }
            }
        }

        // Koordinaten in Kodierung mit a0,b0,...,g6 usw umwandeln
        int x = 0;
        int zeile = 0;
        int spalte = 0;
        while (x < laengeBlockade) {
            raster[koordinatenFuerBlockade[x]] = 1;
            zeile = (int) (koordinatenFuerBlockade[x] / rasterLaenge);
            spalte = koordinatenFuerBlockade[x] % rasterLaenge;
            temp = String.valueOf(alphabet.charAt(spalte));
            alphaBlockierteZellen.add(temp.concat(Integer.toString(zeile)));
            x++;
        }

        //TASK 11: die Methode soll alphaBlockierteZellen zurückgeben
        //...
        return alphaBlockierteZellen;
    }
}
