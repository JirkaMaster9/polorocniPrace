package Map;

public class InteractSpot {
    private String name;
    private boolean hasEnemy;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "InteractSpot{" +
                "name='" + name + '\'' +
                '}';
    }
    public String OnInteraction(){
        //todo write the method
        return "";
    }

    public boolean getHasEnemy() {
        return hasEnemy;
    }
}
