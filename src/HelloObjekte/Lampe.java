package HelloObjekte;

import java.util.Objects;

public class Lampe {
    private boolean leuchtet;

    public Lampe(){
        leuchtet = false;
    }

    public static void main(String[] args) {

    }
    public void anschalten(){
        System.out.println("Lampe leuchtet!");
        leuchtet = true;
    }
    public void ausschalten(){
        System.out.println("Lampe ist aus!");
        leuchtet = false;
    }

    public boolean getLeuchtet() {
        return leuchtet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lampe lampe = (Lampe) o;
        return leuchtet == lampe.leuchtet;
    }

    @Override
    public int hashCode() {
        return Objects.hash(leuchtet);
    }
}
