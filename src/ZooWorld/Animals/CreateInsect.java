/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ZooWorld.Animals;
import java.util.ArrayList;
public class CreateInsect extends Animal implements Insect {
    
    private int isVennon; 
    
    
    public CreateInsect(String specie, String name, String dateOfBirth, String dateOfArrival, int gender, Medication medication, Vacine vacine) {
        super(specie, name, dateOfBirth, dateOfArrival, gender, medication, vacine);
    
    }
    
    @Override
    public void createOffpring(String name, String dateOfBirth, String dateOfArrival, int gender, Medication medication, Vacine vacine) {
        getOffsprings().add(new CreateInsect(this.getSpecie(), name, dateOfBirth, dateOfArrival, gender, medication, vacine));
    }

    public int getIsVennon() {
        return isVennon;
    }

    public void setIsVennon(int isVennon) {
        this.isVennon = isVennon;
    }

    
}
