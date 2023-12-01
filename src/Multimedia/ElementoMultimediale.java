package Multimedia;

public abstract class ElementoMultimediale {
    String titolo;

    public ElementoMultimediale (String titolo){
        this.titolo= titolo;
    }
    public String getTitolo() {
        return titolo;
    }
}