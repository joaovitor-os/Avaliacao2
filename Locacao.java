package avaliacao;

public class Locacao{
    List<Locacao> locacoes = new ArrayList<>();
    private Cliente cliente;
    String id_locacao;
    String id_cliente;
    String data_locacao;
    String data_devolucao;


    void adicionarCliente(Cliente cliente){
        this.clientes.add(cliente);
        cliente.locacoes.add(this);
    }

    double valor_locacao(){
        double total = 0;
        for(Filme filmes: filmes){
             total += filme.valor_locacao ;
            }
    
        return total;
    }

    int qnt_locados(){

        return 0;
    }

}