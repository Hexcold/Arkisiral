/*
 * @author hexcold || (@henrq.p)
 */


package characters.players;

/**
 *
 * @author henri
 */
public abstract class Player {

    protected double life;
    protected double baseAttack;
    protected double lowerAttack;
    protected double rangedAttack;
    protected double powerAttack;

    public Player(double life, double baseAttack, double lowerAttack, double rangedAttack, double powerAttack) {
        this.life = life;
        this.baseAttack = baseAttack;
        this.lowerAttack = lowerAttack;
        this.rangedAttack = rangedAttack;
        this.powerAttack = powerAttack;
    }

    public double getLife() {
        return this.life;
    }

    public double getBaseAttack() {
        return this.baseAttack;
    }

    public double getLowerAttack() {
        return this.lowerAttack;
    }

    public double getRangedAttack() {
        return this.rangedAttack;
    }

    public double getPowerAttack() {
        return this.powerAttack;
    }

    public void setlife(double life) {
        this.life = life;
    }

}