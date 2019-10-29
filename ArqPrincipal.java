package avaliacao;


public class ArqPrincipal{
    public static void main(String[] args) {
        System.out.println("Criando Sistema de Locação");

        Cliente cliente1 = new Cliente("1111","Gionísio","23/03/1977","111.111.111-11",3);
        Cliente cliente2 = new Cliente("2222","Frederico","02/06/1981","222.222.222-22",3);
        Cliente cliente3 = new Clientee("3333","Jubileu","17/08/1969","333.333.333-33",3);
        Cliente cliente4 = new Cliente("4444","Florentina","14/13/1972","444.444.444-44",3);
        Cliente cliente5 = new Cliente("5555","Antonieta","27/11/1983","555.555.555-55",3);

        Filme filme1 = new Filme("11111","Coringa","2019","Drama",4.99,5 );
        Filme filme2 = new Filme("22222","Vingadores: Ultimato","2019","Ação",4.99,5);
        Filme filme3 = new Filme("11122","Rocky III","1982","drama",3.50,3);
        Filme filme4 = new Filme("11133","Creed","2015","drama",4.20,4);
        Filme filme5 = new Filme("33333","O lobo de wall street","2013","drama/comédia",3.99,2);
        Filme filme6 = new Filme("22233","Batman: O Cavaleiro das Trevas","2008","ação",3.50,3);
        Filme filme7 = new Filme("44444","De Volta para o Futuro","1985","ficção cinentifica",3.99,3);
        Filme filme8 = new Filme("44455","Star Wars: Uma Nova Esperança","1977","ficção cientifica",3.99,3);
        Filme filme9 = new Filme("55555","Toy Story","1995","animação",3.99,3);
        Filme filme10 = new Filme("11144","Clube da Luta","1996","drama",2.99,2);
        
        cliente1.adicionarFilme(filme1);
        cliente1.adicionarFilme(filme2);
        cliente1.adicionarFilme(filme6);
        cliente2.adicionarFilme(filme7);
        cliente2.adicionarFilme(filme8);
        cliente3.adicionarFilme(filme3);
        cliente3.adicionarFilme(filme4);
        cliente4.adicionarFilme(filme5);
        cliente4.adicionarFilme(filme10);
        cliente5.adicionarFilme(filme9);

        filme1.adicionarCliente(cliente1);
        filme2.adicionarCliente(cliente1);
        filme3.adicionarCliente(cliente3);
        filme4.adicionarCliente(cliente3);
        filme5.adicionarCliente(cliente4);
        filme6.adicionarCliente(cliente1);
        filme7.adicionarCliente(cliente2);
        filme8.adicionarCliente(cliente2);
        filme9.adicionarCliente(cliente5);
        filme10.adicionarCliente(cliente4);

        System.out.println("Quantidade de Filmes locados por cada cliente" );
        System.out.println("Quantidade de Locações dos Filmes");  
        System.out.println("Valor total de locação"); 
        System.out.println("Quantidade de filmes por Locação."); 




        

    }
}