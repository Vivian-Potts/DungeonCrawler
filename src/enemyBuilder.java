import java.util.Map;

import java.util.Random;

public class enemyBuilder {
    public Enemy buildSlime() {
        Enemy slime = new Enemy(10, "Slime", 20, 0, null, null, null);
        slime.setAttack1(Map.of("Damage:", 12, "Status: ", 1, "TargetSelf: ", 0));
        return slime;
    }

    public Enemy buildGhost() {
        Enemy ghost = new Enemy(12, "Ghost", 20, 0, null, null, null);

        return ghost;

    }
        public Enemy buildRandom(int floor){
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


    public Enemy buildSkeleton() {
        Enemy skeleton = new Enemy(15, "Skeleton", 25, 0, null, null, null);

        return skeleton;

    }

    public Enemy buildDemon() {
        Enemy demon = new Enemy(17, "Demon", 30, 0, null, null, null);

        return demon;
    }

    public Enemy buildWizard() {
        Enemy wizard = new Enemy(20, "Wizard", 35, 0, null, null, null);

        return wizard;
    }

    public Enemy buildWitch(){
        Enemy witch = new Enemy(22, "Witch", 35,0,null, null, null);

        return witch;
    }

    public Enemy buildMage(){
        Enemy mage = new Enemy(24,"Mage",40,0,null, null, null);

        return mage;
    }
}



    //test
    //Test No 2



