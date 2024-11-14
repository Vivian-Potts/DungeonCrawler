import java.util.ArrayList;
public class Enemy {

    private int health,  goldDrop, itemDrop;
    private String name;
    private int[][] attack1, attack2, attack3, attack4;

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

    public int[][] getAttack1() {
        return attack1;
    }

    public int[][] getAttack2() {
        return attack2;
    }

    public int[][] getAttack3() {
        return attack3;
    }

    public int[][] getAttack4() {
        return attack4;
    }





    public Enemy(int health, String name, int[][] attack1, int[][] attack2, int[][] attack3, int[][] attack4, int goldDrop, int itemDrop){
        this.health = health;
        this.name = name;
        this.attack1 = attack1;
        this.attack2 = attack2;
        this.attack3 = attack3;
        this.attack4 = attack4;
    }
}
