package HelloObjekte;

public class ObjektDemo {


    public static void main(String[] args) {
        clearScreen();
        /*Fahrzeuge testAuto = new Fahrzeuge(1);
        int testZahl = 1;
        parameterUebergabeTest(testAuto, testZahl);
        System.out.println("Anzahl der Personen meines Parameter-Test-Autos: "+ testAuto.getanzahlPersonen());
        System.out.println("So sieht meine Testzahl nun aus: "+ testZahl);*/
        fahrzeugeAnzeigen();


    }
    public static void fahrzeugeAnzeigen() {
        System.out.println(Fahrzeuge.getanzErzeugterFahrzeuge());
        Fahrzeuge meinAuto = new PKW(2);
        System.out.println("Fahrzeug: "+meinAuto.toString());
        System.out.println("AHK: "+ meinAuto.getahk());
        System.out.println("FIN: "+meinAuto.getfin());
        System.out.println("Anzahl Personen: "+meinAuto.getanzahlPersonen());
        System.out.println("maxZuladung: "+meinAuto.getmaxZuladung());
        System.out.println("Anzahl erzeugter Fahrzeuge: "+ Fahrzeuge.getanzErzeugterFahrzeuge());
        //Fahrzeug 2
        Fahrzeuge meinAuto2 = new PKW(3);
        System.out.println("Fahrzeug: "+meinAuto2.toString());
        System.out.println("AHK: "+ meinAuto2.getahk());
        System.out.println("FIN: "+meinAuto2.getfin());
        System.out.println("Anzahl Personen: "+meinAuto2.getanzahlPersonen());
        System.out.println("maxZuladung: "+meinAuto2.getmaxZuladung());
        System.out.println("Anzahl erzeugter Fahrzeuge: "+ Fahrzeuge.getanzErzeugterFahrzeuge());
        System.out.println("fahrzeug1 == fahrzeug2 "+ (meinAuto2 == meinAuto));
        System.out.println("fahrzeug1.equals(fahrzeug2) "+ (meinAuto2.equals(meinAuto)));
        System.out.println("Vordeerlicht  Status:"+ meinAuto2.vorderlichtStatus());
        meinAuto2.vorderlichtAnschalten();
        System.out.println("Vordeerlicht  Status:"+ meinAuto2.vorderlichtStatus());
        LKW meinLKW = new LKW(2);
        System.out.println("Sitzplätze: "+ meinLKW.getanzahlPersonen());
        meinLKW.fahren();
        meinLKW.hupen();
        //Casten mit Klassen
        LKW laster = new LKW(3); //LKW initalisiert
        Fahrzeuge unserLKW = laster; //In Variable mit Datentyp Fahrzeuge gespeichert
        LKW dochEinLKW = (LKW) unserLKW; //in Klasse LKW gecastet und in neue Varibale gespeichert


    }
    public static void parameterUebergabeTest(Fahrzeuge einAuto, int eineZahl) {
        einAuto.setanzahlPersonen(2);
        eineZahl = 4;
        einAuto = new PKW(eineZahl);
        return;
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

    }
}

