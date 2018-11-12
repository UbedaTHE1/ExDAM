import java.util.Scanner;

public class Repeticio2_5 {

  public static void main(String[] args) {

    //declarem les variables
    int numEstudiants;
    int nota = 0;
    String nom;
    int notaAlta = 0;
    Scanner info = new Scanner (System.in);
    int contador = 0;
    String nomAlt = "";

    System.out.print("Nombre d'estudiants: ");
    numEstudiants = info.nextInt();

    do {

      System.out.print("Nom --> ");
      nom = info.next();
      System.out.print("Nota --> ");
      nota = info.nextInt();

      if ( nota > notaAlta ) {

        notaAlta = nota;
        nomAlt = nom;

      }

      contador++;

    } while (contador < numEstudiants);

    System.out.println("Nom i nota mes alta del estudiant: " + nomAlt + " " + notaAlta);


  }

}
