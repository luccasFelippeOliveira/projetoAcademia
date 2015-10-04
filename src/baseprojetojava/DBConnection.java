/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseprojetojava;

/**
 * Interface DBConnection
 * faz as operações com banco de dados como: Inserir no DB, Pegar do DB.
 * TODO: Manage more DB instructions
 * @author Luccas
 * @param <T> : Indica um dos objetos Usuario
 *
 */
public interface DBConnection{
    
    
    
    public void addOnDB(Object o);
    
    public Object fetchOfDB(int id, String tabela) throws TabelaNaoExisteException;
    public Object fetchOfDB(int id);
    
    public void listaTabela(String tabela) throws TabelaNaoExisteException;
    
    public void updateItem(int id, String tabela, String comando) throws TabelaNaoExisteException;
    
    public void deleteItem(int id, String tabela) throws TabelaNaoExisteException;
   
    
    
    
}
