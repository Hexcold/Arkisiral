/*
 * @author hexcold || (@henrq.p)
 */

package logic;



public class CheckGame {

    public static boolean checkLife(double lifePlayer, double lifeAdversary) {
        if (lifePlayer <= 0) {
            return false;
        }
        
        if (lifeAdversary <= 0) {
            return false;
        }
        return true;

    }

    public static double baseAttack(double baseAttack, double lifeAdversary) {
        double life = RandomAttack.baseDamegePercentage(baseAttack, lifeAdversary);
        System.out.println(life);
        if (life < 0) {
            life = 0;
        }
        return life;
    }

    public static double lowerAttack(double lowerAttack, double lifeAdversary) {
        double life = RandomAttack.lowerPercentage(lowerAttack, lifeAdversary);
        System.out.println(life);
        if (life < 0) {
            life = 0;
        }
        return life;
    }

    public static double rangedAttack(double powerAttack, double lifeAdversary) {
        double life = RandomAttack.rangedDamegePercentage(powerAttack, lifeAdversary);
        System.out.println(life);
        if (life < 0) {
            life = 0;
        }
        return life;
    }

    public static double powerAttack(double powerAttack, double lifeAdversary) {
        double life = RandomAttack.powerDamegePercentage(powerAttack, lifeAdversary);
        System.out.println(life);
        if (life < 0) {
            life = 0;
        }
        return life;
    }

}
