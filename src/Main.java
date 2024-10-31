public class Main {
    public static void main(String[] args) {
        enemyBuilder enemyBuilder = new enemyBuilder();



        Enemy a = enemyBuilder.buildSlime();
        System.out.println(a.getHealth());
    }
}