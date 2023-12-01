package Multimedia;

import java.util.Scanner;

public class Main {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ElementoMultimediale[] elementi = new ElementoMultimediale[5];
    System.out.println("Creazione elementi multimediali");
    for (int i = 0; i < 5; i++) {
        Integer selection;
        boolean continua = true;
        do {
            System.out.println("Elemento " + (i + 1));
            System.out.println("Che elemento vuoi?");
            System.out.println("1 -> Immagine");
            System.out.println("2 -> Registrazione Audio");
            System.out.println("3 -> Video");
            selection = Integer.parseInt(sc.nextLine());

            switch (selection) {
                case 1 -> {
                    System.out.println("titolo");
                    String titolo = sc.nextLine();
                    System.out.println("luminosità");
                    int luminosita = Integer.parseInt(sc.nextLine());
                    Immagine img = new Immagine(titolo, luminosita);
                    elementi[i] = img;
                    continua = false;
                }
                case 2 -> {
                    System.out.println(" titolo");
                    String titolo = sc.nextLine();
                    System.out.println(" durata");
                    int durata = Integer.parseInt(sc.nextLine());
                    System.out.println(" volume");
                    int volume = Integer.parseInt(sc.nextLine());
                    RegistrazioneAudio reg = new RegistrazioneAudio(titolo, durata, volume);
                    elementi[i] = reg;
                    continua = false;
                }
                case 3 -> {
                    System.out.println(" titolo");
                    String titolo = sc.nextLine();
                    System.out.println("durata");
                    int durata = Integer.parseInt(sc.nextLine());
                    System.out.println(" volume");
                    int volume = Integer.parseInt(sc.nextLine());
                    System.out.println("luminosità");
                    int luminosita = Integer.parseInt(sc.nextLine());
                    Video v = new Video(titolo, durata, volume, luminosita);
                    elementi[i] = v;
                    continua = false;
                }
                default -> {

                }
            }
        }while (continua);
    }
    int daEseguire;
    do{
        System.out.println("cosa vuoi eseguire? (1-5) oppure 0 per finire");
        daEseguire = Integer.parseInt(sc.nextLine());
        if(daEseguire <= 0 || daEseguire > 5){
            continue;
        }
        ElementoMultimediale e = elementi[daEseguire-1];
        if(e instanceof Immagine){
            ((Immagine) e).show();
        }
        if (e instanceof RegistrazioneAudio || e instanceof Video){
            ((Volume) e).play();
        }
    }while (daEseguire != 0);

    sc.close();
}
}

