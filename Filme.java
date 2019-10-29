package avaliacao;

public class Filme{
    List<Cliente> clientes = new ArrayList<>();
    String id_filme;
    String nome_filme;
    Sting data_lancamento;
    String sinopse;
    double valor_locacao;
    int estoque;
    
    Filme(String id_filme, String nome_filme, String data_lancamento, String sinopse, double valor_locacao, int estoque){
        this.id_filme = id_filme;
        this.nome_filme = nome_filme;
        this.data_lancamento = data_lancamento;
        this.sinopse = sinopse;
        this.valor_locacao = valor_locacao;
        this.estoque = estoque;
    }

    void adicionarCliente(Cliente cliente){
        this.clientes.add(cliente);
        cliente.filmes.add(this);
    }

    int qnt_locacoes(){

        return 0;
    }

}