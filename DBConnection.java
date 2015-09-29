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
 * TODO: Use of GENERICS for mutiples classes use
 * @author Luccas
 */
public interface DBConnection {
    
    public void addOnDB(Usuario u);
    
    public Usuario fetchOfDB(int id);
    
}
