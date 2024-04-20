public class Carro {
    private String modelo;
    private int ano;
    private String cor;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    void exibeDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Preço Ano: " + precoAno1);
        System.out.println("Preço Ano: " + precoAno2);
        System.out.println("Preço Ano: " + precoAno3);
    }

    public double calcularMenorPreco() {
        double menorPreco = precoAno1;
        if(menorPreco>precoAno2){
            menorPreco = precoAno2;
        }
        if (menorPreco>precoAno3){
            menorPreco = precoAno3;
        }
        return menorPreco;
    }

    public double calcularMaiorPreco() {
        double maiorPreco = precoAno1;
        if(maiorPreco<precoAno2){
            maiorPreco = precoAno2;
        }
        if (maiorPreco<precoAno3){
            maiorPreco = precoAno3;
        }
        return maiorPreco;
    }

    int calculaIdade() {
        return 2024 - ano;
    }

    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPreco(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public double getPrecoAno1() {
        return precoAno1;
    }

    public double getPrecoAno2() {
        return precoAno2;
    }

    public double getPrecoAno3() {
        return precoAno3;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPrecoAno1(double precoAno1) {
        this.precoAno1 = precoAno1;
    }

    public void setPrecoAno2(double precoAno2) {
        this.precoAno2 = precoAno2;
    }

    public void setPrecoAno3(double precoAno3) {
        this.precoAno3 = precoAno3;
    }
}
