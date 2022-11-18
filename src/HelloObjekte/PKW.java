package HelloObjekte;

public class PKW extends Fahrzeuge{
    private boolean fernlicht;

    public PKW(int anzahlvonSitzen) {
        super(anzahlvonSitzen);
        fernlicht = false;
    }

    public void caprioumbau(){
        fernlicht = true;
    }
}
