import java.util.ArrayList;

public class Player {
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ArrayList<Integer> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Integer> inventory) {
        this.inventory = inventory;
    }



    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    private int health;
    private ArrayList<Integer> inventory = new ArrayList<>();
    private int gold = 0;

    public ArrayList<Integer> getConsumables() {
        return consumables;
    }

    public void setConsumables(ArrayList<Integer> consumables) {
        this.consumables = consumables;
    }

    public void addConsumables(Integer itemToBeAdded){
        consumables.add(itemToBeAdded);
    }

    public void removeConsumables(Integer itemToBeRemoved){
        consumables.remove(itemToBeRemoved);
    }


    private ArrayList<Integer> consumables = new ArrayList<>();
}
