import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ControlEncarrecs {
   private static String ruta = "/home/sma/ITIC/Segundo/M6/M06_UF1_A01-/Fitxers";

   public static void main(String[] args) {
      System.out.println("Quina operacio vols realitza:");
      System.out.println();
      System.out.println("-Generar un nou encàrrec(A)");
      System.out.println();
      System.out.println("-Mostrar un encàrrec (B)");
      System.out.println();
      System.out.println("-Sortir (C)");
      System.out.println();
      char resposta = triaOpcio(Utilitats.readLine());
      while (true) {
         if (resposta == 'A') {
            generaEncarrec();
         } else if (resposta == 'B') {

         } else {
            System.out.println("Fins aviat!");
            return;
         }
      }

   }

   public static char triaOpcio(String resposta) {
      resposta = resposta.toUpperCase();
      while (true) {
         if (resposta.length() == 1) {
            if (resposta.charAt(0) == 'A') {
               return 'A';
            } else if (resposta.charAt(0) == 'B') {
               return 'B';
            } else if (resposta.charAt(0) == 'C') {
               return 'C';
            }
         } else {
            System.out.println("Respon amb nomes una opció.");
         }
         System.out.println("Opció no disponible, torna a introduir la resposta");
         resposta = (Utilitats.readLine()).toUpperCase();
      }
   }

   public static void generaEncarrec() {
      List<Article> ArticlesL = new ArrayList<Article>();
      // Cliente
      String nom = nom(1);
      String telefon = telClient();
      String data = dataClient();

      while (true) {
         // Article
         String producte = nom(2);
         double quantitat = quantitat();
         String unitats = unitatsArticle();
         // instancia en lista

         ArticlesL.add(new Article(producte, quantitat, unitats));

         System.out.println("Vols afegir un altre article");
         Boolean resposta = Utilitats.confirmador(Utilitats.readLine());
         if (!resposta) {
            break;
         }
      }

      System.out.println();
      System.out.println("En quin format vols realitza l'encarrec:");
      System.out.println();
      System.out.println("-Albarà(A)");
      System.out.println();
      System.out.println("-Binari (B)");
      System.out.println();
      System.out.println("-CSV (C)");
      System.out.println();
      char resposta = triaOpcio(Utilitats.readLine());
      if (resposta == 'A') {
         creaEncarrec(resposta, nom, telefon, data, ArticlesL);
      } else if (resposta == 'B') {
         creaEncarrec(resposta, nom, telefon, data, ArticlesL);
      } else {
         creaEncarrec(resposta, nom, telefon, data, ArticlesL);
      }

   }

   public static String nom(int i) {
      String text;
      boolean esDigit = false;
      if (i == 1) {
         System.out.println("Introueix el teu Nom:");
         text = Utilitats.readLine();
         while (true) {
            esDigit = false;
            if (text.isBlank()) {
               System.out.println("El camp és obligatori:");
               text = Utilitats.readLine();
            } else {
               for (int j = 0; j < text.length(); j++) {
                  if (Character.isDigit(text.charAt(j))) {
                     esDigit = true;
                     break;
                  } else {
                     esDigit = false;
                  }
               }
               if (esDigit) {
                  System.out.println("El nom no pot tenir Digits:");
                  text = Utilitats.readLine();
               } else {
                  break;
               }
            }

         }
      } else {
         System.out.println("Introueix el Nom del producte:");
         text = Utilitats.readLine();
         while (true) {
            if (text.isBlank()) {
               System.out.println("El camp és obligatori:");
               text = Utilitats.readLine();
            } else {
               for (int j = 0; j < text.length(); j++) {
                  if (Character.isDigit(text.charAt(j))) {
                     esDigit = true;
                     break;
                  } else {
                     esDigit = false;
                  }
               }
               if (esDigit) {
                  System.out.println("El nom del producte no pot tenir Digits:");
                  text = Utilitats.readLine();
               } else {
                  break;
               }
            }

         }
      }
      return text;
   }

   public static String telClient() {
      String text;
      boolean esLletra = false;
      System.out.println("Introueix el teu Numero:");
      text = Utilitats.readLine();
      while (true) {
         if (text.isBlank()) {
            System.out.println("El camp és obligatori:");
            text = Utilitats.readLine();
         } else {
            for (int j = 0; j < text.length(); j++) {
               if (Character.isLetter(text.charAt(j))) {
                  esLletra = true;
                  break;
               } else {
                  esLletra = false;
               }
            }
            if (esLletra) {
               System.out.println("El Numero no pot tenir lletres:");
               text = Utilitats.readLine();
            } else {
               break;
            }
         }
      }
      return text;
   }

   public static String dataClient() {
      String text;
      boolean esLletra = false;
      System.out.println("Introueix la Data actual(DD/MM/AAAA):");
      text = Utilitats.readLine();
      while (true) {
         if (text.isBlank()) {
            System.out.println("El camp és obligatori:");
            text = Utilitats.readLine();
         } else {
            for (int j = 0; j < text.length(); j++) {
               if (Character.isLetter(text.charAt(j))) {
                  esLletra = true;
                  break;
               } else {
                  esLletra = false;
               }
            }
            if (esLletra) {
               System.out.println("Torna a introduir la data en format(DD/MM/AAAA):");
               text = Utilitats.readLine();
            } else {
               break;
            }
         }
      }

      return text;
   }

   public static String unitatsArticle() {
      String text;
      boolean esDigit = false;
      System.out.println("Introdueix les unitats de l'article (ex. kg, unitats, litres, etc.):");
      text = Utilitats.readLine();
      while (true) {
         if (text.isBlank()) {
            System.out.println("El camp és obligatori:");
            text = Utilitats.readLine();
         } else {
            for (int j = 0; j < text.length(); j++) {
               if (Character.isDigit(text.charAt(j))) {
                  esDigit = true;
                  break;
               } else {
                  esDigit = false;
               }
            }
            if (esDigit) {
               System.out.println("Les unitats no poden ser Numeriques:");
               text = Utilitats.readLine();
            } else {
               break;
            }
         }
      }
      return text.toUpperCase();
   }

   public static double quantitat() {
      String text;
      boolean esDigit = false;
      System.out.println("Introdueix la quantitat :");
      text = Utilitats.readLine();
      while (true) {
         if (text.isBlank()) {
            System.out.println("El camp és obligatori:");
            text = Utilitats.readLine();
         } else {
            for (int j = 0; j < text.length(); j++) {
               if (Character.isLetter(text.charAt(j))) {
                  esDigit = true;
                  break;
               } else {
                  esDigit = false;
               }
            }
            if (esDigit) {
               System.out.println("La quantitat no pot ser Numerica:");
               text = Utilitats.readLine();
            } else {
               break;
            }
         }
      }
      return Double.parseDouble(text);
   }

   public static void creaEncarrec(char text, String nomCli, String telefon, String data, List<Article> ArticlesL) {
      File tiket;

      // Comprovem que la ruta existeix
      File dir = new File(ruta);
      if (!dir.exists()) {
         dir.mkdirs();
      }

      // Depenent del valor de 'text', assignem un nou fitxer a 'tiket'
      if (text == 'A') {
         tiket = new File(ruta, "encarrecs_client_" + nomCli + "_" + System.currentTimeMillis() + ".txt");
         if (!tiket.exists()) {
            try {
               tiket.createNewFile();
            } catch (IOException ex) {
               System.out.println("ERROR: No s'ha pogut crear l'arxiu. " + ex.getMessage());
            }
         }
         escriuArrxiu(tiket, nomCli, telefon, data, ArticlesL, text);
      } else if (text == 'B') {
         tiket = new File(ruta, "encarrecs_client_" + nomCli + "_" + System.currentTimeMillis() + ".dat");
         if (!tiket.exists()) {
            try {
               tiket.createNewFile();
            } catch (IOException ex) {
               System.out.println("ERROR: No s'ha pogut crear l'arxiu. " + ex.getMessage());
            }
         }
         escriuArrxiu(tiket, nomCli, telefon, data, ArticlesL, text);
      } else {
         tiket = new File(ruta, "encarrecs_client_" + nomCli + "_" + System.currentTimeMillis() + ".csv");
         if (!tiket.exists()) {
            try {
               tiket.createNewFile();
            } catch (IOException ex) {
               System.out.println("ERROR: No s'ha pogut crear l'arxiu. " + ex.getMessage());
            }
         }
         escriuArrxiu(tiket, nomCli, telefon, data, ArticlesL, text);
      }
   }

   public static void escriuArrxiu(File tiket, String nomCli, String telefon, String data, List<Article> ArticlesL,
         char tipus) {
      // TXT
      if (tipus == 'A') {
         try {
            FileWriter escritptura = new FileWriter(tiket);
            escritptura.write("Nom del client: " + nomCli + "\n");
            escritptura.write("Telefon del client: " + telefon + "\n");
            escritptura.write("Data de l'encarrec: " + data + "\n");

            escritptura.write("\nQuantitat    \tUnitats\t    \tArticle\n");
            escritptura.write("===============\t=========\t=================\n");

            for (int i = 0; i < ArticlesL.size(); i++) {
               escritptura.write(
                     ArticlesL.get(i).getQuantitat() + "\t\t" + ArticlesL.get(i).getUnitats() + "\t\t"
                           + ArticlesL.get(i).getNom() + "\n");
            }
            escritptura.close();
            System.out.println("Encarrec escrit correctament en el fitxer: " + tiket);

         } catch (IOException ex) {
            System.out.println("ERROR: No s'ha pogut escriure en l'arxiu.");
         }
         // CSV
      } else if (tipus == 'C') {
         try {
            FileWriter escritptura = new FileWriter(tiket);
            escritptura.write(nomCli + "," + telefon + "," + data + ",");
            for (int i = 0; i < ArticlesL.size(); i++) {
               escritptura.write(
                     ArticlesL.get(i).getQuantitat() + "," + ArticlesL.get(i).getUnitats() + ","
                           + ArticlesL.get(i).getNom());
            }
            escritptura.close();
            System.out.println("Encarrec escrit correctament en el fitxer: " + tiket);
         } catch (Exception e) {
            System.out.println("ERROR: No s'ha pogut escriure en l'arxiu.");
         }
         // bin
      } else {

         FileOutputStream = new FileOutputStream(tiket);
      }

   }

   // public static MostraEncarrec
}
