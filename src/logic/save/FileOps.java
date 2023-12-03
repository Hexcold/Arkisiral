/*
 * @author hexcold || (@henrq.p)
 */

package logic.save;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileOps {
    Path path = Paths.get("C:/Users/henri/OneDrive/Documentos/GitHub/SIRILANKA-FACE/src/logic/save/save.txt");
    static String fileName = "C:/Users/henri/OneDrive/Documentos/GitHub/SIRILANKA-FACE/src/logic/save/save.txt";

    public static void write(String content) {
        try {
            // Converta o texto em um array de bytes
            byte[] bytes = content.getBytes();
          // Sobrescreve o arquivo com o novo conteúdo
            Path path = Paths.get("C:/Users/henri/OneDrive/Documentos/GitHub/SIRILANKA-FACE/src/logic/save/save.txt");
            Files.write(path, bytes, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);


        } catch (IOException e) {
            System.err.println("fail: Ocorreu um erro ao sobrescrever o arquivo: " + e.getMessage());
        }

    }
    
    public static String cont() throws IOException {
        try {
            byte[] fileBytes = Files.readAllBytes(Paths.get(fileName));
        String fileContent = new String(fileBytes);
        System.out.println(fileContent);
        return fileContent;
        } catch (IOException e) {
            System.err.println("fail: Ocorreu um erro ao ler o arquivo: " + e.getMessage());
            return "0";
        }   
    }
}
