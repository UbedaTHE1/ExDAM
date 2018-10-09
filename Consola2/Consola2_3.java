import java.util.Scanner;

public class Consola2_3 {

  public static void main(String[] args) {


    String producte, codi;
    long unitEstoc;
    double preu;

    //Part de la introducció de dades del usuari
    Scanner dades = new Scanner(System.in);

    System.out.println("Per favor introdueix la següent informació: ");

    System.out.print("Nom de producte: ");

    producte = dades.next();

    System.out.print("Unitats en estoc: ");

    unitEstoc = dades.nextLong();

    System.out.print("Preu: ");

    preu = dades.nextDouble();

    System.out.print("Codi de referència: ");

    codi = dades.next();


    //Part de la conversió en la capsa de signes
    System.out.printf(" %n");

    System.out.printf("+-------------------------------+%n");

    System.out.printf("" , producte);










  }

}
