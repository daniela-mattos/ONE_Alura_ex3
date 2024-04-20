package Animais;

public class Cachorro extends Animal {

    public void roerMoveis() {
        System.out.println("Sou um pestinha roendo tudo");
    }
    @Override
    public void emitirSom() {
        System.out.println("au-au");
    }
}
