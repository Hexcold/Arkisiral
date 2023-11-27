package characters.adversary;

public abstract class Adversary {
    
    protected String name;
    protected double life;
    protected double baseAttack;
    protected double lowerAttack;
    protected double rangedAttack;
    protected double powerAttack;

    public Adversary(String name, double life, double baseAttack, double lowerAttack, double rangedAttack, double powerAttack) {
        this.name = name;
        this.life = life;
        this.baseAttack = baseAttack;
        this.lowerAttack = lowerAttack;
        this.rangedAttack = rangedAttack;
        this.powerAttack = powerAttack;
    }
    
    public String getName() {
        return this.name;
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
