/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
package baseprojetojava;

public class Produto extends ItensDeDB{
    
    //Campos de Instância
    //TODO: Melhorar os campos de instância, adicionar campos relevantes
    private int id;
    private String nomeDoProduto;
    
    //Construtor
    public Produto() {
        id = ItensDeDB.getID();
        
    }
    
    //Getters e Setters Relevantes
    
    public void setNomeDoProduto(String nome) {
        this.nomeDoProduto = nome;
    }
    
    public String getNomeDoProduto() {
        return this.nomeDoProduto;
    }
    
    public int getId() {
        return this.id;
    }
    
    //Override de Object
    @Override
    public String toString() {
        return "Nome: " + this.nomeDoProduto + " Id: " + this.id;
    }
    
    
}
