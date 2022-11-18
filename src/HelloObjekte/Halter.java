package HelloObjekte;

public class Halter {

    public static void main(String[] args) {
        Fahrzeuge seinAuto = new PKW(2);
        LKW seinLKW = new LKW(2);
        Fahrzeuge[] Garage = {seinAuto, seinLKW};
        Werkstatt werkstattdesVertrauens = new Werkstatt();
        werkstattdesVertrauens.hupeTesten(Garage[0]);
        werkstattdesVertrauens.hupeTesten(Garage[1]);

    }
}
