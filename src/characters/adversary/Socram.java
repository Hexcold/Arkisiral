/*
 * @author hexcold || (@henrq.p)
 */


package characters.adversary;

public class Socram extends Adversary {

    public Socram() {
        super("Socram",120, 15, 20, 25, 30);
    }
    
    @Override
    public double getPowerAttack() {
        return this.powerAttack * 1.5;
    }
    
    @Override
    public double getLife() {
        return this.life - 5;
    }
}
