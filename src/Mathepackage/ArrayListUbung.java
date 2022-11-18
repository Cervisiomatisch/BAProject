package Mathepackage;

import HelloObjekte.*;

import java.util.*;

public class ArrayListUbung {

    public static void main(String[] args) {
        zweiteSache();
    }

    public static void ersteSache() {
        List<String> einigeKlassen = new ArrayList<String>();
        einigeKlassen.add("Integer");
        einigeKlassen.add("Boolean");
        einigeKlassen.add("Fahrzeuge");
        //ArrayList ausgeben lassem
        System.out.println("Unsortiert: " + einigeKlassen);
        //ArrayList sortieren
        Collections.sort(einigeKlassen);
        System.out.println("Sortiert: " + einigeKlassen);
    }
    public static void zweiteSache() {
        List<Fahrzeuge> fahrzeugeList = new ArrayList<>();

        fahrzeugeList.add(new PKW(4));
        fahrzeugeList.add(new LKW(2));
        fahrzeugeList.add(new Fahrrad());
        //Ausgeben
        System.out.println("Unsortiert: "+ fahrzeugeList);
        //sortieren
        Collections.sort(fahrzeugeList);
        System.out.println("Sortiert: "+ fahrzeugeList);
    }
}