/*
 * @author hexcold || (@henrq.p)
 */


package characters.adversary;

public class Yekmal extends Adversary {

    public Yekmal() {
        super("Yekmal",200, 25, 15, 20, 50);
    }
    
    @Override
    public double getLife() {
        return this.life - 1;
    }
}
