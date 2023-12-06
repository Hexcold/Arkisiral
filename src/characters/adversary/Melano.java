/**
 * @author hexcold || (@henrq.p)
 */
package characters.adversary;

public class Melano extends Adversary{

    public Melano() {
        super("Melano",250, 25, 30, 45, 50);
        
            
    }
    
    @Override
    public double getLife() {
        return this.life - 10;
    }
}
