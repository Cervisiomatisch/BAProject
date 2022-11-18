package HelloObjekte;

public abstract class Fahrzeuge implements Comparable<Fahrzeuge>{
    //Klassenspezifisch
    private static int anzErzeugterFahrzeuge = 0;
        //Statische Konstanten /final = unverändderlich)
        final static int HOECHSTGESCHWINDIGKEIT_INNERORTS = 50;
    //Objektspezifisch
    private Lampe vorderlicht;
    private int fin;
    private int anzahlPersonen;
    private int maxZuladung;
    private boolean ahk;

    //Constructer
    //Einfacher
    public Fahrzeuge() {
        fin = 0;
        maxZuladung=  500;
        ahk = false;
        anzErzeugterFahrzeuge ++;
        vorderlicht = new Lampe();
        System.out.println("Fahrzeug wird erstellt ...");
    }
    //Überladener
    public Fahrzeuge(int eineanzahlPersonen) {
        this(); //ruft die anderen Variablen des Konstrukters Fahrzeuge() auf
        anzahlPersonen = eineanzahlPersonen;
        //folgende Zeilen sind nicht Prüfungsrelevant
        //System.out.println("Überladener K. ClassName: "+Thread.currentThread().getStackTrace()[2].getClassName());
        //System.out.println("Überladener K. Method Name: "+Thread.currentThread().getStackTrace()[2].getMethodName());

    }
    // Standardmethoden für Objekte
    public void fahren() {
        System.out.println("Brumm Brumm");
    }

    public void hupen() {
        System.out.println("Tut Tut");
    }
    // getter
    public int getfin() {
        return fin;
    }
    public int getanzahlPersonen() {
        return anzahlPersonen;
    }
    public int getmaxZuladung() {
        return maxZuladung;
    }
    public boolean getahk() {
        return ahk;
    }
//Klassengetter (mit static)
    public static int getanzErzeugterFahrzeuge() {
        return anzErzeugterFahrzeuge;
    }
    // setter
    public void setfin(int eineFin) {
        fin = eineFin;
    }
    public void setanzahlPersonen(int eineanzahlPersonen) {
        if (eineanzahlPersonen < 1) {
            anzahlPersonen = 1;
        } else {
            anzahlPersonen = eineanzahlPersonen;
        }
    }
    public void setmaxZuladung(int eineMaxZuladung) {
        if (eineMaxZuladung < 0) {
            maxZuladung = 750;
        } else {
            maxZuladung = eineMaxZuladung;
        }
    }
    public void setahk(boolean eineahk) {
        ahk = eineahk;
    }
    public boolean vorderlichtStatus(){
        return vorderlicht.getLeuchtet();
    }
    public void vorderlichtAnschalten(){
        vorderlicht.anschalten();
    }
    public  void vorderlichtAusschalten(){
        vorderlicht.ausschalten();
    }
    @Override
    public int compareTo(Fahrzeuge vergleichskfz){
        return Integer.compare(anzahlPersonen, vergleichskfz.getanzahlPersonen());
    }
}
