
public class Hero implements Comparable<Hero>{
    private int health;

    public Hero(int h){
        this.health = h;
    }

    public int getHealth(){
        return health;
    }

    @Override
    public int compareTo(Hero otherHero){
        return Integer.compare(health, otherHero.getHealth());
    }
}