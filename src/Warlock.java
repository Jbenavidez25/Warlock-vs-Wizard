public class Warlock extends Character {

    private Character Warlock;

    Warlock(String name) {
        super(name);
    }

    public void icestorm(Character Blackace) {
        System.out.println("\n" + super.characterName + "Attacks " + Blackace.characterName + " using icestorm ( Damage -50) (mana cost - 50)");
        int damages = 50;
        manaPoints += 55;
        damage(Blackace, damages);
    }

    public void display() {
        System.out.println("\nWarlock " + characterName);
        System.out.println("HP: " + healthPoints);
        System.out.println("Mana: " + manaPoints + "\n");

    }


    public void heal() {
        super.healthPoints += 15;
        super.manaPoints += 25;
        System.out.println("\n" + super.characterName + "recover some HP and Mana");
        System.out.println("HP: " + super.healthPoints);
        System.out.println("Mana: " + super.manaPoints);
    }

}







