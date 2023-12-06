/*
 * @author hexcold || (@henrq.p)
 */


package characters.players;

public class Player02 extends Player{


    public Player02(String name, double life, double baseAttack, double lowerAttack, double rangedAttack, double powerAttack) {
        super(name, life, baseAttack, lowerAttack, rangedAttack, powerAttack);
    }

    
    @Override
    public double getLife() {
        return this.life;
    }
}

