/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseprojetojava;

/**
 *
 * @author Luccas
 */
public class BaseProjetoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DBConnection dbConnection = new BancoDados();
        
        
        int[] tabelaId = new int[8];
        
        Usuario user1 = new Usuario();
        user1.setNome("Jão");
        tabelaId[0] = user1.getId();
        dbConnection.addOnDB(user1);
        
        Usuario user2 = new Usuario();
        user2.setNome("Maria");
        tabelaId[1] = user2.getId();
        dbConnection.addOnDB(user2);
        
        Usuario user3 = new Usuario();
        user3.setNome("Luccas");
        tabelaId[2] = user3.getId();
        dbConnection.addOnDB(user3);
        
        Treinador tr1 = new Treinador();
        tr1.setNome("Maromba 1");
        tabelaId[3] = tr1.getId();
        dbConnection.addOnDB(tr1);
        
        Treinador tr2 = new Treinador();
        tr2.setNome("Maromba 2");
        tabelaId[4] = tr2.getId();
        dbConnection.addOnDB(tr2);
        
        Treinador tr3 = new Treinador();
        tr3.setNome("Maromba 3");
        tabelaId[5] = tr3.getId();
        dbConnection.addOnDB(tr3);
        
        Produto p1 = new Produto();
        p1.setNomeDoProduto("Whey");
        tabelaId[6] = p1.getId();
        dbConnection.addOnDB(p1);
        
        Produto p2 = new Produto();
        p2.setNomeDoProduto("Flango com batata");
        tabelaId[7] = p2.getId();
        dbConnection.addOnDB(p2);
        
        
        for(Integer i : tabelaId) {
            Object retorno;
            retorno = dbConnection.fetchOfDB(i);
            System.out.println(retorno.toString());
        }
        
        
    }
    
}
