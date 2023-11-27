/*
 * @author hexcold || (@henrq.p)
 */

package logic.save;

import java.io.IOException;

import view.History.MenuStoryNaryata;
import view.History.MenuStorySocram;
import view.History.MenuStoryMelano;
import view.History.MenuStorySenrub;
import view.History.MenuStoryYekmal;
import view.MenuMain;
        

public class Save {


    public static void game() throws IOException {
        String inputUser = null;

        switch (FileOps.cont()) {

            case "1" -> {
                MenuStoryNaryata menuStoryNaryata = new MenuStoryNaryata();
                menuStoryNaryata.setVisible(true);
            }

            case "2" -> {
                MenuStorySocram menuStorySocram = new MenuStorySocram();
                menuStorySocram.setVisible(true);
            }

            case "3" -> {
                MenuStoryYekmal menuStoryYekmal = new MenuStoryYekmal();
                menuStoryYekmal.setVisible(true);
            }

            case "4" -> { 
                MenuStoryMelano menuStoryMelano = new MenuStoryMelano();
                menuStoryMelano.setVisible(true);
            }
                
            case "5" -> { 
                MenuStorySenrub menuStorySenrub = new MenuStorySenrub();
                menuStorySenrub.setVisible(true);
            }

            default -> {
                MenuMain manuMain = new MenuMain();
                System.out.println("Não foi possível carregar o jogo.");
            }
        }
    }
}