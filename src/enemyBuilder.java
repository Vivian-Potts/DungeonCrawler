import java.util.HashMap;
import java.util.Map;

public class enemyBuilder {
    public Enemy buildSlime() {
        Enemy slime = new Enemy(10, "Slime", 20, null, null, null, null);
        slime.setAttack1(Map.of("Damage:", 12, "Status: ", 1, "TargetSelf: ", 0));


        return slime;


    }

    public Enemy buildGhost() {
        Enemy ghost = new Enemy(12, "Ghost", 20, null, null, null, null);

        return ghost;

    }

    public Enemy buildSkeleton() {
        Enemy skeleton = new Enemy(15, "Skeleton", 25, null, null, null, null);

        return skeleton;

    }

    public Enemy buildDemon() {
        Enemy demon = new Enemy(17, "Demon", 30, null, null, null, null);

        return demon;
    }

    public Enemy buildWizard() {
        Enemy wizard = new Enemy(20, "Wizard", 35, null, null, null, null);

        return wizard;
    }

    public Enemy buildWitch(){
        Enemy witch = new Enemy(22, "Witch", 35,null,null, null, null);

        return witch;
    }

    public Enemy buildMage(){
        Enemy mage = new Enemy(24,"Mage",40,null,null, null, null);

        return mage;
    }

}