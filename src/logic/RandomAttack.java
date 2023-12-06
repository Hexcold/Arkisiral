/*
 * @author hexcold || (@henrq.p)
 */
package logic;

import java.util.Random;

public class RandomAttack {

    public static int randomGiveAwayAttack(String name) {
        Random rand = new Random();
        int index;

        switch (name) {
            case "Naryata" -> {
                index = rand.nextInt(2) + 1;
                return index;
            }

            case "Yekmal" -> {
                index = rand.nextInt(3) + 1;
                return index;
            }

            case "Senrub" -> {
                index = rand.nextInt(3) + 1;
                return index;
            }

            case "Melano" -> {
                index = rand.nextInt(3) + 1;
                return index;
            }

            case "Socram" -> {
                index = rand.nextInt(3) + 1;
                return index;
            }

            default -> {
                index = rand.nextInt(3) + 1;
                return index;
            }
        }
    }

    public static int baseRandomGivenAway() {
        Random rand = new Random();
        int n = rand.nextInt(10) + 1;
        System.out.println("DADO : " + n);
        return n;
    }

    public static int lowerRandomGivenAway() {
        Random rand = new Random();
        int n = rand.nextInt(15) + 1;
        System.out.println("DADO : " + n);
        return n;
    }

    public static int rangedRandomGivenAway() {
        Random rand = new Random();
        int n = rand.nextInt(20) + 1;
        System.out.println("DADO : " + n);
        return n;
    }

    public static int powerRandomGivenAway() {
        Random rand = new Random();
        int n = rand.nextInt(30) + 1;
        System.out.println("DADO : " + n);
        return n;
    }

    public static double baseDamegePercentage(double damege, double life) {

        switch (baseRandomGivenAway()) {
            case 1 -> {
                return life - (damege * 0.1);
            }

            case 2 -> {
                return life - (damege * 0.2);
            }

            case 3 -> {
                life = life - (damege * 0.3);
                return life;
            }

            case 4 -> {
                life = life - (damege * 0.4);
                return life;
            }

            case 5 -> {
                life = life - (damege * 0.5);
                return life;
            }

            case 6 -> {
                life = life - (damege * 0.6);
                return life;
            }

            case 7 -> {
                life = life - (damege * 0.7);
                return life;
            }

            case 8 -> {
                life = life - (damege * 0.8);
                return life;
            }

            case 9 -> {
                life = life - (damege * 0.9);
                return life;
            }

            case 10 -> {
                life = life - (damege * 1);
                return life;
            }

            default -> System.out.println("fail: numero invalido");

        }
        return life;
    }

    public static double lowerPercentage(double damege, double life) {
        switch (lowerRandomGivenAway()) {
            case 1 -> {
                return life - (damege * 0.0);
            }

            case 2 -> {
                return life - (damege * 0.1);
            }

            case 3 -> {
                life = life - (damege * 0.2);
                return life;
            }

            case 4 -> {
                life = life - (damege * 0.2);
                return life;
            }

            case 5 -> {
                life = life - (damege * 0.3);
                return life;
            }

            case 6 -> {
                life = life - (damege * 0.4);
                return life;
            }

            case 7 -> {
                life = life - (damege * 0.4);
                return life;
            }

            case 8 -> {
                life = life - (damege * 0.5);
                return life;
            }

            case 9 -> {
                life = life - (damege * 0.6);
                return life;
            }

            case 10 -> {
                life = life - (damege * 0.6);
                return life;
            }

            case 11 -> {
                life = life - (damege * 0.7);
                return life;
            }

            case 12 -> {
                life = life - (damege * 0.8);
                return life;
            }

            case 13 -> {
                life = life - (damege * 0.8);
                return life;
            }

            case 14 -> {
                life = life - (damege * 0.9);
                return life;
            }

            case 15 -> {
                life = life - (damege * 1);
                return life;
            }

            default -> System.out.println("fail: numero invalido");

        }
        return life;
    }

    public static double rangedDamegePercentage(double damege, double life) {
        switch (rangedRandomGivenAway()) {
            case 1 -> {
                return life - (damege * 0.0);
            }

            case 2 -> {
                return life - (damege * 0.1);
            }

            case 3 -> {
                life = life - (damege * 0.15);
                return life;
            }

            case 4 -> {
                life = life - (damege * 0.2);
                return life;
            }

            case 5 -> {
                life = life - (damege * 0.25);
                return life;
            }

            case 6 -> {
                life = life - (damege * 0.3);
                return life;
            }

            case 7 -> {
                life = life - (damege * 0.35);
                return life;
            }

            case 8 -> {
                life = life - (damege * 0.4);
                return life;
            }

            case 9 -> {
                life = life - (damege * 0.45);
                return life;
            }

            case 10 -> {
                life = life - (damege * 0.5);
                return life;
            }

            case 11 -> {
                life = life - (damege * 0.55);
                return life;
            }

            case 12 -> {
                life = life - (damege * 0.6);
                return life;
            }

            case 13 -> {
                life = life - (damege * 0.65);
                return life;
            }

            case 14 -> {
                life = life - (damege * 0.7);
                return life;
            }

            case 15 -> {
                life = life - (damege * 0.75);
                return life;
            }

            case 16 -> {
                life = life - (damege * 0.8);
                return life;
            }

            case 17 -> {
                life = life - (damege * 0.85);
                return life;
            }

            case 18 -> {
                life = life - (damege * 0.9);
                return life;
            }

            case 19 -> {
                life = life - (damege * 0.95);
                return life;
            }

            case 20 -> {
                life = life - (damege * 1);
                return life;
            }

            default -> System.out.println("fail: numero invalido");

        }
        return life;
    }

    public static double powerDamegePercentage(double damege, double life) {
        switch (powerRandomGivenAway()) {
            case 1 -> {
                return life - (damege * 0.0);
            }

            case 2 -> {
                return life - (damege * 0.1);
            }

            case 3 -> {
                life = life - (damege * 0.15);
                return life;
            }

            case 4 -> {
                life = life - (damege * 0.2);
                return life;
            }

            case 5 -> {
                life = life - (damege * 0.25);
                return life;
            }

            case 6 -> {
                life = life - (damege * 0.3);
                return life;
            }

            case 7 -> {
                life = life - (damege * 0.35);
                return life;
            }

            case 8 -> {
                life = life - (damege * 0.4);
                return life;
            }

            case 9 -> {
                life = life - (damege * 0.45);
                return life;
            }

            case 10 -> {
                life = life - (damege * 0.5);
                return life;
            }

            case 11 -> {
                life = life - (damege * 0.55);
                return life;
            }

            case 12 -> {
                life = life - (damege * 0.6);
                return life;
            }

            case 13 -> {
                life = life - (damege * 0.65);
                return life;
            }

            case 14 -> {
                life = life - (damege * 0.7);
                return life;
            }

            case 15 -> {
                life = life - (damege * 0.75);
                return life;
            }

            case 16 -> {
                life = life - (damege * 0.8);
                return life;
            }

            case 17 -> {
                life = life - (damege * 0.85);
                return life;
            }

            case 18 -> {
                life = life - (damege * 0.9);
                return life;
            }

            case 19 -> {
                life = life - (damege * 0.95);
                return life;
            }

            case 20 -> {
                life = life - (damege * 1);
                return life;
            }

            case 21 -> {
                life = life - (damege * 0.75);
                return life;
            }

            case 22 -> {
                life = life - (damege * 0.8);
                return life;
            }

            case 23 -> {
                life = life - (damege * 0.85);
                return life;
            }

            case 24 -> {
                life = life - (damege * 0.9);
                return life;
            }

            case 25 -> {
                life = life - (damege * 0.95);
                return life;
            }

            case 26 -> {
                life = life - (damege * 1);
                return life;
            }

            case 27 -> {
                life = life - (damege * 1);
                return life;
            }

            case 28 -> {
                life = life - (damege * 1);
                return life;
            }

            case 29 -> {
                life = life - (damege * 1);
                return life;
            }

            case 30 -> {
                life = life - (damege * 1);
                return life;
            }

            default -> System.out.println("fail: numero invalido");

        }
        return life;
    }
}
