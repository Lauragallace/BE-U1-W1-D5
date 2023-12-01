package Multimedia;

public class Immagine extends ElementoMultimediale implements Luminosita{

    int luminosita;

    Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = 5;
    }

    @Override
    public void alzaLuminosita() {
this.luminosita++;
    }

    @Override
    public void abbassaLuminosita() {
this.luminosita--;
    }
    private String stampaLuminosita(){
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i < luminosita; i++){
            sb.append("*");
        }
        return sb.toString();
    }

    public void show(){
        System.out.println(getTitolo()+" "+stampaLuminosita());
    }
}
