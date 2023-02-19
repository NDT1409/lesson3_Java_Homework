package game.hero;

public class Elf {

    public Elf() {

    }
    private int id;
    private int health;
    private int strength;
    private int stamina;
    private int agility;
    private int defence;
    static int power;
    static int charisma;
    static int magic;


    public Elf(int id, int health, int strength, int stamina, int agility, int defence) {

        this.id = id;
        this.health = health;
        this.strength = strength;
        this.stamina = stamina;
        this.agility = agility;
        this.defence = defence;
    }
// ID
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
//  HEALTH
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
//  STRENGTH
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
//  Stamina
    public int getStamina() {
        return stamina;
    }
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
//  Agility
    public int getAgility() {
        return agility;
    }
    public void setAgility(int agility) {
        this.agility = agility;
    }
//  Defence
    public int getDefence() {
        return defence;
    }
    public void setDefence(int defence) {
        this.defence = defence;
    }

}
