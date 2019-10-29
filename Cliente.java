package avaliacao;

public class Cliente{
    List<Filme> filmes = new ArrayList<>();
    String id_cliente;
    String nome;
    String data_nasc;
    String CPF;
    int dias_pdevolucao;

    Cliente(String id_cliente, String nome, String data_nasc, String CPF, int dias_pdevolucao){
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.CPF = CPF;
        this.dias_pdevolucao = dias_pdevolucao;
    }

    void adicionarFilme(Filme filme){
        this.filmes.add(filme);
        filme.clientes.add(this);
    }

}