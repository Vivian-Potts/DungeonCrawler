

import java.util.HashMap;
import java.util.Map;

public class Enemy {

    private int health, goldDrop;
    private String name, itemDrop;

    private Map<String, Integer> attack1;
    private Map<String, Integer> attack2;
    private Map<String, Integer> attack3;



   public void setAttack1(String dmg, int dmgNum){
       this.attack1.put(dmg,dmgNum);
   }

    public void setAttack2(String dmg, int dmgNum) {
        this.attack2.put(dmg,dmgNum);
    }

    public void setAttack3(String dmg, int dmgNum) {
        this.attack3.put(dmg, dmgNum);
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

    public String getItemDrop() {
        return itemDrop;
    }

    public Map<String, Integer> getAttack1() {return attack1;}

    public Map<String, Integer> getAttack2() {return attack2;}

    public Map<String, Integer> getAttack3() {return attack3;}

    public Enemy(int health, String name, Map<String, Integer> attack1, Map<String,Integer> attack2, Map<String, Integer> attack3, int goldDrop, String itemDrop){
        this.health = health;
        this.name = name;
        this.attack1 = attack1;
        this.attack2 = attack2;
        this.attack3 = attack3;

    }


}
