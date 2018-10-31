import java.util.Scanner;

public class Repeticio1_1 {

  public static void main(String[] args) {

    //declarem les variables
    //per que començi per 1 hem de posar 1 perque despres suma.
    int i = 1;
    int num;
    Scanner info = new Scanner (System.in);

    //Mostrem per pantalla missatge pel usuari
    System.out.print("Escriu un numero enter: ");
    num = info.nextInt();

    //Bucle o Repeticio
    do {

      System.out.print(i + " ");
      i++;

    } while ( i <= num );



  }

}
