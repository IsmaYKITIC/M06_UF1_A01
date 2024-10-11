# M06_UF1_A01-

Aquest és el meu projecte sobre un sistema d'encàrrecs. El programa du a terme les següents tasques:

Gestió de comandes i creació de les comandes en els següents formats (albarà (txt), csv, binari (dat)), permet la recollida de dades dels clients, el registre 
    1. d'articles i la generació de tiquets de manera eficient i intuïtiva.
    2. La recerca i visualització de les comandes generades de forma fàcil i intuïtiva.

PD: Malauradament, i sense cap ànim de lucre per realitzar algunes tasques com la veracitat de les dades (com el telèfon i la data), s'ha utilitzat regex proporcionat pel ChatGPT. :)

Explicació del programa:

    Classes: El programa compta amb tres classes de les quals una està destinada a crear l'objecte article, una altra és un fitxer de funcionalitats i l'altra és el programa en si.

    Classe Utilitats: En aquesta trobem 3 mètodes per les funcionalitats del programa i per reduir les línies de codi al bloc principal.

            Un confirmador per les opcions de si/no. --> confirmador()
            Una funció per triar en els diferents menús del programa. --> triaOpcio()
            Una funció per llegir l'entrada de text. --> readLine()
    Classe ControlEncarrecs: Aquí trobem les funcionalitats i tot el flux de funcionament del programa.

        Un mètode per generar el menú principal on es gestionaran totes les funcions del programa. --> menu()

        Un mètode per generar els encàrrecs on es fa la recerca de dades i es crea el fitxer on han de ser. --> generaEncarrec()

        Un mètode que redacta l'encarrec en el format escollit amb les dades i la ruta escollida.

        Hi ha diversos mètodes que s'encarreguen de recollir dades fent proves de veracitat a les dades introduïdes. --> nom(), telefon(), ...()

        Una funció que et mostra els encàrrecs ja creats anteriorment. --> mostraEncarrec()

        Dos funcions per mostrar el fitxer en un dels 2 tipus disponibles. --> llegeixBin(), llegeixCSV()

    Classe Article: Aquesta és la classe on guardem els atributs de l'objecte article.




