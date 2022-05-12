public class Wizard extends Character {

    Wizard(String name) {
        super(name);
    }

    public void firestorm(Character enemyCharacter) {
        System.out.println("\n" + super.characterName + "attacks " + enemyCharacter.characterName + " with firestorm (Damage - 50) (mana cost -55)");
        int damagePoints = 50;
        super.manaPoints -= 55;
        damageTarget(enemyCharacter, damagePoints, manaPoints);
    }

    public void display() {
        System.out.println("\nWizard: " + characterName);
        System.out.println("HP: " + healthPoints);
        System.out.println("Mana: " + manaPoints + "\n");
    }

    public void heal() {
        super.healthPoints += 15;
        super.manaPoints += 25;
        System.out.println("\n" + super.characterName + "Use Healing Magic (HP +15) (Mana +25)");
        System.out.println("HP: " + healthPoints);
        System.out.println("Mana: " + manaPoints);
    }

    public void lvlup() {
        int level = 10;
        System.out.println(super.characterName + "Gained Exp to Level up!");
        System.out.print(super.characterName + "Level = " + level + "\n");
        System.out.println("the Wizrads HP and mana is also increase! (HP +100) (Mana +100)");
    }


}


