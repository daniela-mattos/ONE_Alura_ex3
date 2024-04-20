package Animais;

public class Gato extends Animal{

    public void arranharMoveis(){
        System.out.println("Eu gosto de me esticar arranhando coisas");
    }

    @Override
    public void emitirSom(){
        System.out.println("miau-miau");
    }
}
