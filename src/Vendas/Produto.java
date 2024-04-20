package Vendas;

public class Produto implements  Vendavel{
    private String nome;
    private double preco;
    private int quantidade;

    public Produto() {

    }

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public double calcularPrecoTotal() {
        return 0;
    }

    @Override
    public String toString() {
        return "\nNome: " + this.nome + " Preco: " + this.preco + " Quantidade: " + this.quantidade;
    }
}