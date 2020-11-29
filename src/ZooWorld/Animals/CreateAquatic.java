package ZooWorld.Animals;


public class CreateAquatic extends Animal implements Aquatic {
    
    private int canBeOutSideWatter;
    
    public CreateAquatic(String specie, String name, String dateOfBirth, String dateOfArrival, int gender, Medication medication, Vacine vacine) {
        super(specie, name, dateOfBirth, dateOfArrival, gender, medication, vacine);
        
    }
    
    @Override
    public void createOffpring(String name, String dateOfBirth, String dateOfArrival, int gender, Medication medication, Vacine vacine) {
        getOffsprings().add(new CreateAquatic(this.getSpecie(), name, dateOfBirth, dateOfArrival, gender, medication, vacine));
    }

    public void setCanBeOutSideWatter(int canBeOutSideWatter) {
        this.canBeOutSideWatter = canBeOutSideWatter;
    }    
    
    public int getCanBeOutSideWatter() {
        return canBeOutSideWatter;
    }

}
