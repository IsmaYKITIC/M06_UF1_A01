import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
 * Classe que simplifica la lectura per entrada estàndard.
 */
public class Utilitats {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // Mètode per llegir una línia des de l'entrada estàndard
    public static String readLine() {
        try {
            String line = reader.readLine();
            if (line == null || line.trim().isEmpty()) {
                throw new RuntimeException("No deixis la cadena buida");
            }
            return line;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Mètode per confirmar amb una resposta de "sí" o "no"
    public static boolean confirmador(String resposta) {
        resposta = resposta.trim().toLowerCase();

        if (resposta.equals("s") || resposta.equals("si")) {
            return true;
        }

        if (resposta.equals("n") || resposta.equals("no")) {
            return false;
        }

        return false;
    }
}
