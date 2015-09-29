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
        
        DBConnection dbConnection = new UsuarioDB();
        
        int[] tabelaId = new int[3];
        
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
        
        for(Integer i : tabelaId) {
            Usuario retorno;
            retorno = dbConnection.fetchOfDB(i);
            System.out.println(retorno.toString());
        }
        
        
    }
    
}
