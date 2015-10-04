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
public class TabelaNaoExisteException extends Exception{
    
    public TabelaNaoExisteException() {
        super("Não exite tabela mencionada");
    }
    
}
