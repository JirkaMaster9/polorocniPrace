package Rune;

public class Rune {
    private String name;
    private int priority;
    private float addDamage,multDamage,addMana,multMana,addDefence,multDefence;

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public float getAddDamage() {
        return addDamage;
    }

    public float getMultDamage() {
        return multDamage;
    }

    public float getAddMana() {
        return addMana;
    }

    public float getMultMana() {
        return multMana;
    }

    public float getAddDefence() {
        return addDefence;
    }

    public float getMultDefence() {
        return multDefence;
    }
  public float countDamage(float i){
    return  (i+addDamage)*multDamage;
  }
  public float countMana(float i){
    return  (i+addMana)*multMana;
  }
}
