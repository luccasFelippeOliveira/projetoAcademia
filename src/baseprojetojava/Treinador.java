/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseprojetojava;

/**
 * Classe Treinador basica -- Principio de Teste
 * TODO: Fazer as relações de Treinador e Usuario
 * TODO: Completar a Classe com dados relevantes
 * @author Luccas
 */
public class Treinador extends ItensDeDB{
    //Campos de Instância
    
    private final int id;
    private String nome;
    
    //Campo de Classe
    
    //private static int toId = 0;
    
    //Construtor da Classe
    
    public Treinador() {
        this.id = super.getID();
        
    }
    
    //Getters and Setters
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getId() {
        return this.id;
    }
    
    //Overrides de Object
    @Override
    public String toString() {
        return "Nome: " + nome + "Id: " + id;
    }
    
}
