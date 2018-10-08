import java.util.Scanner;

public class Consola1_3 {

  public static void main(String[] args) {

    // Posem variables del que ens demana (nom y edat).
    int edat;
    String nom;

    //Funció Scanner. En aquest cas poserem dadesUser que es lo que ens demana xd
    Scanner dadesUser = new Scanner(System.in);


    System.out.print("Hola com et dius? ");

    //Posem que la variable "nom" sigui lo que tecligi el usuari. EN aquest cas el nom.
    nom = dadesUser.nextLine();

    //Seguim amb lo que diu l'exercici...
    System.out.print("Hola " + nom + ". Quants anys tens? ");

    //Fem el mateix amb l'edat.. però canviant el "dadesUser.nextLine();" per "dadesUser.nextInt();"
    //perquè no es un String sino un Int
    edat = dadesUser.nextInt();

    System.out.print("Aixi que et dius " + nom + " i tens " +edat + " anys.");


  }

}
