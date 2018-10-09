import java.util.Scanner;

public class Consola2_2 {

  public static void main(String[] args) {

    String nom1, nom2, nom3;

    Scanner noms = new Scanner(System.in);

    System.out.print("Escriu tres noms: ");

    nom1 = noms.next();
    nom2 = noms.next();
    nom3 = noms.next();



    System.out.printf("+--------------------------------------------------+%n");
    System.out.printf("| 1 | %45s|%n" , nom1);
    System.out.printf("| 2 | %45s|%n" , nom2);
    System.out.printf("| 3 | %45s|%n" , nom3);
    System.out.printf("+--------------------------------------------------+%n");

  }


}
