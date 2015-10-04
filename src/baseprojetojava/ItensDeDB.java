/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseprojetojava;

/**
 *
 *  Superclasse que auxilia na manutenção de id's unicos
 *  necessario para a operação fetchOfDB()
 * @author Luccas
 */
public class ItensDeDB {
    
   private static int toId = 0;
   
   protected static int getID() {
       int id = toId;
       toId ++;
       return id;
   }
   
}
