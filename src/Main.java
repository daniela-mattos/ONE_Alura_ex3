import CalculaSala.CalculadoraSalaRetangular;
import Tabuada.TabuadaMultiplicacao;
import Temperatura.ConversorTemperaturaPadrao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Exercicio 1
        Pessoa p1 = new Pessoa();
        p1.digaOla();
        p1.setNome("Laranja");
        p1.setIdade(18);

        Pessoa p2 = new Pessoa();
        p2.setNome("Jaranga");
        p2.setIdade(32);

        ArrayList <Pessoa> listaPessoas = new ArrayList();
        listaPessoas.add(p1);
        listaPessoas.add(p2);
        System.out.println("Tamanho da lista: " + listaPessoas.size());
        System.out.println("Primeira Pessoa: " + p1.getNome());
        System.out.println("Lista de Pessoas: " + listaPessoas);

        System.out.println("\n *--*\n");

        // Exercicio 2
        Calculadora calc = new Calculadora();
        System.out.println("O dobro do número é: \n" + calc.calculeODobro(4));;

        System.out.println("\n *--*\n");

        // Exercicio 3
        Musica mus = new Musica();
        mus.titulo = "Saquei";
        mus.artista = "Qual";
        mus.anoLancamento = 2000;

        mus.exibeFichaTecnica();

        mus.avaliaMusica(5.5);
        mus.avaliaMusica(8.3);
        mus.avaliaMusica(4.5);

        System.out.println(mus.numeroAvaliacoes);
        System.out.println("A média de avaliações é: " + mus.calculaMedia());;

        System.out.println("\n *--*\n");

        //Exercicio 4
        Carro meuCarro = new Carro();
        meuCarro.definirModelo("lada");
        meuCarro.setAno(1979);
        meuCarro.setCor("Azul");
        meuCarro.setPrecoAno1(500);
        meuCarro.setPrecoAno2(100);
        meuCarro.setPrecoAno3(4000);

        System.out.println(meuCarro.calcularMaiorPreco());;

        meuCarro.exibeDados();
        System.out.println(String.format("O carro tem %d anos.", meuCarro.calculaIdade()));

        System.out.println("\n *--*\n");

        Aluno umAluno = new Aluno();
        umAluno.nome = "Cara";
        umAluno.idade = 20;

        Aluno doisAluno = new Aluno();
        doisAluno.nome = "Maria";
        doisAluno.idade = 21;

        umAluno.exibeDados();
        doisAluno.exibeDados();

        CalculadoraSalaRetangular calcular = new CalculadoraSalaRetangular();
        System.out.println("Perímetro: " + calcular.calcularPerimetro(2,2,2));
        System.out.println("Area: " + calcular.calcularArea(10, 5));

        System.out.println("\n *--*\n");

        TabuadaMultiplicacao multiplicacao = new TabuadaMultiplicacao();
        multiplicacao.mostrarTabuada(5);

        System.out.println("\n *--*\n");

        ConversorTemperaturaPadrao converte = new ConversorTemperaturaPadrao();
        System.out.println(converte.fahrenheitParaCelsius(76)+"ºC");
        System.out.println(converte.celsiusParaFahrenheit(32)+"ºF");

    }
}