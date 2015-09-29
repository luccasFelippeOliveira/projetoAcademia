/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseprojetojava;

import java.util.*;



/**
 *
 * @author Luccas
 */
public class UsuarioDB implements DBConnection {
    
    private List<Usuario> dB = new ArrayList();
    
    public UsuarioDB() {
       
    }
    
    
    @Override
    public void addOnDB(Usuario u) {
        //TODO: Checagem de Erros
        dB.add(u);
    }
    @Override
    public Usuario fetchOfDB(int id) {
        int i;
        Usuario temp;
        //TODO: Melhorar a procura no DB
        
        
        
        for(i = 0; i < dB.size(); i++) {
            temp = dB.get(i);
            if(temp.getId() == id){
                return temp;
            }
        }
       
        return null;
    }
    
}
