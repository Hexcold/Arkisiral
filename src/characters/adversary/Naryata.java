/**
 * @author hexcold || (@henrq.p)
 */
package characters.adversary;

public class Naryata extends Adversary {

    public Naryata() {
        super("Naryata",100, 10, 15, 20, 30);
    }
    
    @Override
    public double getLife() {
        return this.life - 1;
    }


}
