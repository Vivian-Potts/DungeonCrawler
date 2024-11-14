import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FloorBuilder {
    static int floor = 1;
    static void buildFloor(){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> options = new ArrayList<>();
        ArrayList<Enemy> availableEnemies = new ArrayList<>();

        for (int i = 0; i <3; i++) {
            int randomID = random.nextInt(4);
            if (randomID < 2) {
                availableEnemies.add(enemyBuilder.buildRandom(floor));
            } else if (randomID < 3) {
                options.add("Campfire");
            } else {
                options.add("Shop");
            }
        }

        System.out.println("The dungeon once again splits into 3 paths, each containing one of the following");
            for(Enemy n : availableEnemies){
                System.out.println(n.getName());
            }
            for(String e : options){
                System.out.println(e);
            }







    }


}
