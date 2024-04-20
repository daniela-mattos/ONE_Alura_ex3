package Animais;

public class TesteAnimais {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.roerMoveis();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();
    }
}
