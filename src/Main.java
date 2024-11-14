import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Player p = new Player();
        p.addConsumables(4);
        p.addConsumables(4);
        p.removeConsumables(4);
        System.out.println(p.getConsumables().toString());
    }
}