import java.util.HashMap;

public class enemyBuilder {
    public Enemy buildSlime(){
        Enemy slime = new Enemy(10,"Slime", null,null, null, 20,null);
        slime.setAttack1("Damage: ", 5);
        slime.setAttack2("Damage: ", 6);
        slime.setAttack3("Damage: ", 7);
        return  slime;


    }

    public Enemy buildGhost(){
        Enemy ghost = new Enemy(12,"Ghost", null, null , null, 20, null);
        ghost.setAttack1("Damage: ", 7);
        ghost.setAttack2("Damage: ", 6);
        ghost.setAttack3("Damage: ", 5);
        return ghost;

    }



}
