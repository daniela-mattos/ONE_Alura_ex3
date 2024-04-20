package Vendas;

import java.util.ArrayList;

public class Testes {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.setNome("sabao");
        produto1.setPreco(200);
        produto1.setQuantidade(10);

        Produto produto2 = new Produto();
        produto2.setNome("agua");
        produto2.setPreco(20);
        produto2.setQuantidade(320);

        Produto produto3 = new Produto();
        produto3.setNome("coracao");
        produto3.setPreco(100);
        produto3.setQuantidade(100);

        Produto produto4 = new Produto("Sacada", 15.50, 500);
        ProdutoPerecivel lata = new ProdutoPerecivel("Lata", 15.99, 5);
        lata.setValidade("15/04/1999");
        System.out.println(lata.toString());

        System.out.println("*--*");

        ArrayList <Produto> listaProdutos = new ArrayList();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);


        System.out.println("Tamanho da Lista de produtos: " + listaProdutos.size());
        System.out.println("*--*");

        System.out.println("Produto 2: " + listaProdutos.get(1));
        System.out.println("*--*");

        System.out.println("Lista de produtos: " + listaProdutos);

    }
}
