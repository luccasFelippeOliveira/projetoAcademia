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
public class Usuario {
    private int id;
    private String nome;
    //TODO: Add more relevant fields.
    
    //CLASS Fields
    
    static private int toId = 0;
    
    
    //Constructor
    
    public Usuario()
    {
       this.id = toId;
       toId ++;
    }
    
    //Instace Methods
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getId() {
        return this.id;
    }
    
    @Override
    public String toString() {
        return "Nome: " + this.nome + " id: " + this.id;
    }
}
