package HelloObjekte;

public class LKW extends Fahrzeuge{

    private boolean vollBeladen;
    private boolean anhaenger;

    public LKW(int anzahlSitze){
        super(anzahlSitze); //ruft Unterklasse auf
        vollBeladen = false;
        anhaenger = false;
    }
    public void beladen(){
        vollBeladen = true;
    }
    public void entladen(){
        vollBeladen = false;
    }
    public void anhaengen(){
        anhaenger = true;
    }
    public void abhaengen(){
        anhaenger = false;
    }

    @Override
    public void hupen() {
        System.out.println("Starkes Tut Tut!");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
