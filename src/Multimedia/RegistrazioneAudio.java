package Multimedia;

    public class RegistrazioneAudio extends ElementoMultimediale implements Volume {
    static int volume = 5;
    int durata;

    public RegistrazioneAudio(String _titolo, int _durata) {
        super(_titolo);
        this.durata = _durata;
    }

        @Override
        public void play() {

        }

        @Override
    public void alzaVolume() {
        if (volume < 10) {
            volume++;
            System.out.println("volume:" + volume);
        } else {
            System.out.println("Volume massimo");
        }
    }

    @Override
    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("volume:" + volume);
        } else {
            System.out.println("Volume minimo");
        }
    }
}


