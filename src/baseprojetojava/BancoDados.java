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
    
    private String[] tabelas = {"usuario", "treinador", "produto" };
    
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
    public Object fetchOfDB(int id, String tabela) throws NaoEncontradoException, TabelaNaoExisteException {
        
        //Verifica se a tabela está certa, caso contrário lança EXCEPTION
        String tabelaSemCase = tabela.toLowerCase(); //Para não ser CASE-SENSITIVE
        boolean isTabela = false;
        for(String str: tabelas) {
            if(tabelaSemCase == str) {
                //É tabela
                isTabela = true;
            }
        }
        //Se foi pelo laço e não encontrou nome correspondente
        
        if(!isTabela) {
            throw new TabelaNaoExisteException();
        }
        
        switch(tabela) {
            case "Usuario":
                for(Usuario u : tabelaUsuario) {
                    if(u.getId() == id){
                        return u;
                    }
                }
            case "Treinador":
                for(Treinador t : tabelaTreinador) {
                    if(t.getId() == id) {
                        return t;
                    }
                }
            case "Produto":
                for(Produto p: tabelaProduto) {
                    if(p.getId() == id) {
                        return p;
                    }
                }
            default :
                throw new NaoEncontradoException("Não foi encontrado");
        }
        
    }
    
    @Override
    public Object fetchOfDB(int id)  throws NaoEncontradoException{
        //Nesse método é desconhecido a tabela então checa todas as tabeleas
        
        for (Usuario u : tabelaUsuario) {
            if(u.getId() == id) {
                return u;
            }
        }
        
        for (Treinador t : tabelaTreinador) {
            if(t.getId() == id) {
                return t;
            }
        }
        
        for(Produto p: tabelaProduto) {
            if(p.getId() == id) {
                return p;
            }
        }
        
        //Se ainda não retornou significa que não encontrou nas tabelas
        
        throw new NaoEncontradoException("id não encontrado");
    }
    @Override
    public void listaTabela(String tabela) throws TabelaNaoExisteException {
        
        String tabelaSemCase = tabela.toLowerCase();
        
        boolean isTabela = false;
        for(String str : tabelas) {
            if(tabela == str) {
                isTabela = true;
            }
        }
        
        //Se a String tabela não é tabela então lança TabelaNaoExisteException
        
        if(!isTabela) {
            throw new TabelaNaoExisteException();
        }
        
        switch(tabelaSemCase) {
            case "usuario":
                for(Usuario u : tabelaUsuario) {
                    System.out.println(u.toString());
                }
                break;
            case "treinador":
                for(Treinador t: tabelaTreinador) {
                    System.out.println(t.toString());
                }
                break;
            case "produto":
                for(Produto p: tabelaProduto) {
                    System.out.println(p.toString());
                }
                break;
            default:
                    break;
                
        }
        //Não tem caso default pq já foi verificado a existencia da tabela.
    }
    
    @Override
    public void updateItem(int id, String tabela,String comando) throws TabelaNaoExisteException, NaoEncontradoException {
        //Usar os métodos GET/SET dos intems.
        Usuario usuarioUpdate;
        Treinador treinadorUpdate;
        Produto produtoUpdate;
        Object objectFromDB;
        String[] comandoSplit = comando.split(":"); //Comando deve ser inserido como campo:valor
        
        
        
        
        objectFromDB = fetchOfDB(id, tabela);
        if(objectFromDB instanceof Usuario) {
            usuarioUpdate = (Usuario) objectFromDB;
            switch(comandoSplit[0]) {
                //Adicionar os campos aqui!!!!!
                case "nome":
                    usuarioUpdate.setNome(comandoSplit[1]);
                    break;
            }
        }
        
        if(objectFromDB instanceof Treinador) {
            treinadorUpdate = (Treinador) objectFromDB;
            switch(comandoSplit[0]) {
                //Adicionar os campos aqui!!!!!
                case "nome":
                    treinadorUpdate.setNome(comandoSplit[1]);
                    break;
            }
        }
        
        if(objectFromDB instanceof Produto) {
            produtoUpdate = (Produto) objectFromDB;
            switch(comandoSplit[0]) {
                //Adicionar os campos aqui!!!!!
                case "nome":
                    produtoUpdate.setNomeDoProduto(comandoSplit[1]);
                    break;
            }
        }
    }
    
    @Override
    public void deleteItem(int id, String tabela)throws NaoEncontradoException, TabelaNaoExisteException {
        Usuario usuarioDelete;
        Treinador treinadorDelete;
        Produto produtoDelete;
        Object toDelete;
        
        toDelete = fetchOfDB(id, tabela);
        
        if(toDelete instanceof Usuario) {
             tabelaUsuario.remove(toDelete);
        }
        
        if(toDelete instanceof Treinador) {
            tabelaTreinador.remove(toDelete);
        }
        
        if(toDelete instanceof Produto) {
            tabelaProduto.remove(toDelete);
        }
    }
    
}
