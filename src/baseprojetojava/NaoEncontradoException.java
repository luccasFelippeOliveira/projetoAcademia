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
public class NaoEncontradoException extends RuntimeException {
    
    public NaoEncontradoException() {
        super("Objeto não encontrado");
    }
    
    public NaoEncontradoException(String msg) {
        super(msg);
    }
    
}
