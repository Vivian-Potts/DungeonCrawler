import java.util.Random;

public class enemyBuilder {
    public static Enemy buildSlime(){
        Enemy slime = new Enemy(12,"Slime", new int[][]{{1,2},{1,2}},null,null,null,2,0);
        return  slime;
    }

    public static Enemy buildRandom(int floor){
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        if (floor == 1){
            switch (randomNumber) {
                case (0):
                    return (buildSlime());

                case (1):
                    return (buildSlime());
            }
            }
        return buildSlime();
        }
    }


    //test
    //Test No 2



