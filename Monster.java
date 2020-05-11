public class Monster {

    //attributes
    private String name;
    private int damage;
    private int life;

    public Monster(String name, int life, int damage){
            this.name = name;
            this.damage = damage;
            this.life = life;
    }


    // getters
    public String getName() {
        return this.name;
    }
    
    public int getDamage() {
        return this.damage;
    }

    public int getLife() {
        return this.life;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setLife(int life) {
        this.life = life;
    }

    //methode instanciee
    public String attack(Monster monster) {

        monster.life -= this.damage;

        if ( monster.life > 0) {
            return String.format(monster.name + " has " + monster.life + " points remaining");
        } else {
            return String.format(monster.name + " is KO!");
        }
    }
}