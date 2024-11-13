import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        enemyBuilder enemyBuilder = new enemyBuilder();
        ArrayList<Integer> playerInventory = new ArrayList<>();
        int playerGold = 0;
        playerInventory.add(1);
        playerInventory.add(1);




        Enemy a = enemyBuilder.buildSlime();
        System.out.println(a.getHealth());
    }
}