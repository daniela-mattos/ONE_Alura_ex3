package Tabuada;

public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada(int a) {
        for (int i = 1; i < 11; i++) {
            System.out.println(a + " * " + i + " = " + a*i);
        }
    }
}
