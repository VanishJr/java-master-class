package acaademy.learnprogramming;

public class Player {

    public String FullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health > 0) {
            System.out.println("Player was damaged: " + damage + " and his health is " + healthRemaining() );
        }
        if (this.health <= 0) {
            System.out.println("Player knocked out and his health is " + healthRemaining());
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
