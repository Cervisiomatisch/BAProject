package HelloObjekte;

public class Fahrrad extends Fahrzeuge{

    public Fahrrad() {
        super(1);
    }

    @Override
    public void hupen() {
        System.out.println("Ring Ring!");
    }
}
