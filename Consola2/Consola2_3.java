import java.util.Scanner;

public class Consola2_3 {

  public static void main(String[] args) {


    String producte, codi;
    long unitEstoc;
    double preu;
    double pesetas;


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

    //conversió euros a pesetas
    pesetas = (preu * 166);

    //Part de la conversió en el bloc de signes
    //producte i codi
    System.out.printf("%n+-------------------------------+%n");
    System.out.printf("|%s%8s|",producte,"");
    System.out.printf("%16s|",codi);
    System.out.printf("%n+-------------------------------+%n");

    //estoc, preu i pesetas
    System.out.printf("|%14s|","Estoc:  ");
    System.out.printf("%8s unitats|",unitEstoc);
    //next line
    System.out.printf("%n|%s%7s|","Import:","");
    System.out.printf("%16s|","");
    System.out.printf("%n|%10s €|",preu,"");
    System.out.printf("%7s pessetes|%n",pesetas);









  }

}
