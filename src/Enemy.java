import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Enemy {

    private int health, goldDrop;
    private String name;
    private int itemDrop;
    private ArrayList<Integer> status;

    /**
     *
     */
    private Map<String, Integer> attack1;
    private Map<String, Integer> attack2;
    private Map<String, Integer> attack3;


    /**
     *
     * @param attack1 : Map
     */
    public void setAttack1(Map<String, Integer> attack1) {
        this.attack1 = attack1;

    }

    public void setAttack2(Map<String, Integer> attack2) {
        this.attack2 = attack2;
    }

    public void setAttack3(Map<String, Integer> attack3) {
        this.attack3 = attack3;
    }


    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int getGoldDrop() {
        return goldDrop;
    }

    public String getName() {
        return name;
    }

    public int getItemDrop() {
        return itemDrop;
    }

    public Map<String, Integer> getAttack1() {return attack1;}

    public Map<String, Integer> getAttack2() {return attack2;}

    public Map<String, Integer> getAttack3() {return attack3;}


    public Enemy(int health, String name, int goldDrop, int itemDrop, Map<String, Integer> attack1, Map<String, Integer> attack2, Map<String, Integer> attack3) {
        this.health = health;
        this.goldDrop = goldDrop;
        this.name = name;
        this.itemDrop = itemDrop;
        this.attack1 = attack1;
        this.attack2 = attack2;
        this.attack3 = attack3;
    }
}
