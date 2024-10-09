/*
 * Classe que simplifica la lectura per entrada estàndard.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Entrada {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String readLine() {
        try {
            String line = reader.readLine();
            if (line == null) {
                throw new RuntimeException("No Deixis la cadena buida");
            }
            return line;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
