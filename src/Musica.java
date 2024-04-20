public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numeroAvaliacoes;

    void exibeFichaTecnica() {
        String fichaTecnica = String.format("""
                Título: %s
                Artista: %s
                Ano de Lancamento: %d
                """, titulo, artista, anoLancamento);

        System.out.println(fichaTecnica);
    }

    void avaliaMusica(double avaliacao) {
        this.avaliacao += avaliacao;
        numeroAvaliacoes++;
    }

    double calculaMedia() {
        return avaliacao / numeroAvaliacoes;
    }

}
