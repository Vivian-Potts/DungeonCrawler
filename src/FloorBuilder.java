import javax.swing.text.html.Option;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FloorBuilder {
    static int floor = 1;
    static void buildFloor(){
        enemyBuilder enemyBuilder = new enemyBuilder();
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

        Boolean validResponse = false;

        while(!validResponse) {


            for (Enemy n : availableEnemies) {
                System.out.println(n.getName());
            }
            for (String e : options) {
                System.out.println(e);
            }


            System.out.println("What will you encounter?");
            String response = scanner.next();

            for (String option : options) {
                if (option.equalsIgnoreCase(response)) {
                    if (response.equalsIgnoreCase("Campfire")) {
                        //CAMPFIRE CODE HERE
                        validResponse = true;
                    } else if (response.equalsIgnoreCase("Shop")) {
                        //SHOP CODE HERE
                        validResponse = true;
                    }

                }
            }
            for (Enemy enemy : availableEnemies) {
                if (enemy.getName().equalsIgnoreCase(response)) {
                    //FIGHT CODE HERE
                    validResponse = true;
                }
            }
        }



    }


}
