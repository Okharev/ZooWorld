/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZooWorld.Animals;
import java.util.ArrayList;
public interface Avian {

    default String canFly(int t) {
        return t == 1 ? "Yes" : "No"; 
    }
    
    default String hasFeeders(int t) {
        return t == 1 ? "Yes" : "No"; 
    }
}
