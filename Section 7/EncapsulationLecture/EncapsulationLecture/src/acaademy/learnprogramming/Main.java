package acaademy.learnprogramming;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.FullName = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//
//        damage = 11;
//        player.loseHealth(damage);

        EnhancedPlayer player = new EnhancedPlayer("Ivan", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}