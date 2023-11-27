/*
 * @author hexcold || (@henrq.p)
 */

package logic;

import characters.adversary.Naryata;
import java.util.Scanner;

import characters.players.Player01;

public class RobotAttack {

    
    public static Naryata naryata = new Naryata();
    public static Scanner sc = new Scanner(System.in);

    public static void enamyAttack(String name, Player01 player) {

        switch (RandomAttack.randomGiveAwayAttack(name)) {
            case 1:
                player.setlife(Game.baseAttack(naryata.getBaseAttack(), player.getLife()));
                System.out.println("Ataque base: " + naryata.getBaseAttack());
                System.err.println("Sua Vida: " + player.getLife());
                break;

            case 2:
                player.setlife(Game.lowerAttack(naryata.getLowerAttack(), player.getLife()));
                System.out.println("Ataque base: " + naryata.getLowerAttack());
                System.err.println("Sua Vida: " + player.getLife());
                break;

            case 3:
                player.setlife(Game.rangedAttack(naryata.getRangedAttack(), player.getLife()));
                System.out.println("Ataque base: " + naryata.getRangedAttack());
                System.err.println("Sua Vida: " + player.getLife());
                break;

            case 4:
                player.setlife(Game.powerAttack(naryata.getPowerAttack(), player.getLife()));
                System.out.println("Ataque base: " + naryata.getPowerAttack());
                System.err.println("Sua Vida: " + player.getLife());
                return;

            default:
                System.err.println("Opção inválida ");
                break;
        }
    }

}
