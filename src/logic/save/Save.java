/*
 * @author hexcold || (@henrq.p)
 */
package logic.save;

import java.io.IOException;
import javax.swing.JOptionPane;
import view.History.data.DataMelano;
import view.History.data.DataNaryata;
import view.History.data.DataPlayer;
import view.History.data.DataSenrub;
import view.History.data.DataSocram;
import view.History.data.DataYekmal;
import view.MenuMain;

public class Save {

    public static void game() throws IOException {
        try {
            switch (FileOps.cont()) {

                case "0" -> {
                    DataPlayer dataPlayer = new DataPlayer();
                    dataPlayer.setVisible(true);
                }

                case "1" -> {
                    DataNaryata dataNaryata = new DataNaryata();
                    dataNaryata.setVisible(true);
                }

                case "2" -> {
                    DataSocram dataSocram = new DataSocram();
                    dataSocram.setVisible(true);
                }

                case "3" -> {
                    DataYekmal dataYekmal = new DataYekmal();
                    dataYekmal.setVisible(true);
                }

                case "4" -> {
                    DataMelano dataMelano = new DataMelano();
                    dataMelano.setVisible(true);
                }

                case "5" -> {
                    DataSenrub dataSenrub = new DataSenrub();
                    dataSenrub.setVisible(true);
                }

                default -> {
                    FileOps.write("0");
                    MenuMain menuMain = new MenuMain();
                    menuMain.setVisible(true);
                    System.err.println("fail: Não foi possível carregar o save. Tente novamente");
                    JOptionPane.showMessageDialog(null, "fail: Não foi possível carregar o save. Tente novamente");
                }
            }

        } catch (NumberFormatException e) {
            System.err.println("fail: Não foi possível carregar o save. " + e.getMessage());
            JOptionPane.showMessageDialog(null, "fail: Não foi possível carregar o save. " + e.getMessage());
        }

    }
}

