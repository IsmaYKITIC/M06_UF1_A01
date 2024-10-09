public class ControlEncarrecs {
   public static void main(String[] args) {
      System.out.println("Quina operacio vols realitza:");
      System.out.println();
      System.out.println("-Generar un nou encàrrec(A)");
      System.out.println();
      System.out.println("-Mostrar un encàrrec (B)");
      System.out.println();
      System.out.println("-Sortir (C)");
      System.out.println();
      String resposta = menu(Entrada.readLine());
      
         
   } 
   public static char menu(String resposta)  {
      resposta= resposta.toUpperCase();
      while (true) {
         if (resposta.length()==1) {
            if (resposta.charAt(0)== 'A') {
               return 'A'
            }else if (resposta.charAt(0)== 'B') {
              return 'B'
            }else if (resposta.charAt(0)== 'C') {
               System.out.println("Fins aviat!");
               return 'C' ;
            }
         }else{
            System.out.println("Respon amb nomes una opció.");
         }
         System.out.println("Opció no disponible, torna a introduir la resposta");
         resposta=(Entrada.readLine()).toUpperCase();
      }
       
   }
   public static void generaEncarrec(){
      System.out.println();
   }
   //public static MostraEncarrec


} 