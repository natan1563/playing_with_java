import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LeitorDeTamanhoDeArquivos {
    public static void main(String args[])
    {
       List<String> arquivos = new ArrayList<>();
       arquivos.add("users.json");
       arquivos.add("products.json");
       arquivos.add("admins.json");

       arquivos.forEach(fileName -> {
           try {
               pegarTamanhoDoArquivo(fileName);
           } catch (Exception e) {
               System.out.println(e.getMessage());
           }
       });
    }

    public static void pegarTamanhoDoArquivo(String arquivo) throws Exception {
        File currentFile = new File("src/arquivos/" + arquivo);

        if (!currentFile.exists()) {
            throw new Exception("Arquivo não encontrado");
        }

        System.out.println("O tamanho do arquivo é de: " + currentFile.length() + " bytes");
    }
}
