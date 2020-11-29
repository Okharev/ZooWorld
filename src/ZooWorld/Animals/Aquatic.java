package ZooWorld.Animals;


import java.util.ArrayList;
public interface Aquatic {
    
    default String canBeOutsideWatter(int t) {
        return t == 1 ? "Yes" : "No";
    }
}
