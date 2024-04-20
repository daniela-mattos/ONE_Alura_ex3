package Vendas;

public class ProdutoPerecivel extends Produto {
    private String validade;

    public ProdutoPerecivel(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
    public String getValidade() {
        return validade;
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() + " \nPreço: " + getPreco() + " \nQuantidade: " + getQuantidade() + "\nValidade: " + getValidade();
    }
}
