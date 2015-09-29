/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseprojetojava;

import java.util.*;

/**
 * Simulação de Banco de Dados contem as opções de DBConnection(@Override's)
 * Cada tabela é representada por uma lista
 * @author Luccas
 * 
 */
public class BancoDados implements DBConnection {
    
    //Representação do Banco de Dados
    //TODO: Melhorar a representação do banco de dados? HashMap?
    private List<Usuario> tabelaUsuario = new ArrayList();
    private List<Treinador> tabelaTreinador = new ArrayList();
    private List<Produto> tabelaProduto = new ArrayList();
    
    
    @Override
    public void addOnDB(Object o) {
        if( o instanceof Usuario){
            tabelaUsuario.add((Usuario) o);
        }
        if(o instanceof Treinador) {
            tabelaTreinador.add((Treinador) o);
        }
        if( o instanceof Produto) {
            tabelaProduto.add((Produto) o);
        }
        
        //TODO: Fazer tratamento de Erros aqui
        //E.G. Trows ClasseNaoValidaException
    }
    
    @Override
    public Object fetchOfDB(int id) {
        //TODO: Fazer alguma identificação de tabela -- CODIGO EXTREMAMENTE INEFICIENTE---
        Usuario retornoUsuario ;
        Treinador retornoTreinador;
        Produto retornoProduto;
        
        //Checagem da tabela de Usuarios
        
        for(int i = 0 ; i < tabelaUsuario.size(); i++) {
            retornoUsuario = tabelaUsuario.get(i);
            if(retornoUsuario.getId() == id) {
                return retornoUsuario;
            }
        }
        
        //Se está aqui, não encontrou na tabela de usuário.
        
        for(int i = 0; i < tabelaTreinador.size(); i++) {
            retornoTreinador = tabelaTreinador.get(i);
            if(retornoTreinador.getId() == id) {
                return retornoTreinador;
            }
        }
        //Se está aqui, não encontrou na tabela de Treinador.
        
        for(int i = 0 ; i < tabelaProduto.size(); i++) {
            retornoProduto = tabelaProduto.get(i);
            if(retornoProduto.getId() == id) {
                return retornoProduto;
            }
        }
        //Se está aqui, não encontrou nada retorna NULL
        
        return null;
        
    }
    
    public void listaTabelaUsuarios() {
        System.out.println(tabelaUsuario.toString());
    }
    
}
