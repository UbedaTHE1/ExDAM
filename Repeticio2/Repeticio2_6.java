import java.util.Scanner;

public class Repeticio2_6 {

  public static void main(String[] args) {

    //declarem les variables
    int numEstudiants;
    int nota = 0;
    String nom;
    int notaAlta = 0;
    Scanner info = new Scanner (System.in);
    int contador = 0;
    String nomAlt = "";
    int notaAlta2 = 0;
    String nomAlt2 = "";

    System.out.print("Nombre d'estudiants: ");
    numEstudiants = info.nextInt();

    do {

      System.out.print("Nom --> ");
      nom = info.next();
      System.out.print("Nota --> ");
      nota = info.nextInt();

      if ( nota > notaAlta ) {
        notaAlta2 = notaAlta;
        nomAlt2 = nomAlt;
        notaAlta = nota;
        nomAlt = nom;
      } else if ( nota > notaAlta2 ) {
        notaAlta2 = nota;
        nomAlt2 = nom;
      }

      contador++;

    } while (contador < numEstudiants);

    System.out.println("Nom i nota mes alta del estudiant: " + nomAlt + " | " + notaAlta);
    System.out.println("Nom i nota més alta del segon estudiant: " + nomAlt2 + " | " + notaAlta2);

  }

}
