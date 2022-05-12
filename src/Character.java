public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */

    Character(String name) {
        characterName = name;

    }

    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */


    /**
     * Create a method to Damage Target Character
     */


    public void damage(Character Blackace, int damages) {
        Blackace.healthPoints -= damages;
        manaPoints -= 50;
        System.out.println("Current HP of Wizard: " + Blackace.healthPoints);
    }


    public void damageTarget(Character enemyCharacter, int damagePoints, int manaPoints) {
        /**
         * Deduct health points from enemy character
         */
        enemyCharacter.healthPoints -= damagePoints;
        enemyCharacter.manaPoints -= 55;
        System.out.println("enemy character HP Left = " + enemyCharacter.healthPoints);

                /**
                 * Prompt Character is defeated if HP falls below 0
                 * eg. Character Shaman defeated.
                 */
                if (enemyCharacter.healthPoints <= 0) {
                    System.out.println("\n The Warlock " + enemyCharacter.characterName + "is now Defeated!!!");
                    System.out.println("The winner is the Wizard " + characterName + " !!");

                }
            }


            public void stat() {
                level = 10;
                healthPoints = 100 + 100;
                manaPoints = 200 + 100;
                System.out.println("\nWizard Name: " + (characterName));
                System.out.println("Hp: " + healthPoints);
                System.out.println("Mana: " + manaPoints);
                System.out.println("level: " + level);
            }
        }












