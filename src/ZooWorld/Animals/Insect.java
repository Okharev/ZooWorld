/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZooWorld.Animals;

import java.util.ArrayList;
public interface Insect {

    default String isVennon(int t) {
        return t==1 ? "Yes": "No"; 
    }
    
    public ArrayList<String> toArrayList();
     
    public ArrayList<String> nameVariables();
}
