/*
 * @author hexcold || (@henrq.p)
 */
package characters.adversary;


public class Senrub extends Adversary {

    public Senrub() {
        super("Senrub",1500, 40, 55, 45, 60);
    }
    
    @Override
    public double getLife() {
        return this.life - 2;
    }
    
    
}
