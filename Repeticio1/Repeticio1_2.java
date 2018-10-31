import java.util.Scanner;

public class Repeticio1_2 {

  public static void main(String[] args) {

    //Declarem les variables
    int i = 1;
    int num;
    Scanner info = new Scanner (System.in);

    //Mostrem per pantalla missatge pel usuari
    System.out.print("Escriu un numero enter: ");
    num = info.nextInt();

    //Bucle o Repeticio
    while ( i <= num ) {

      System.out.print(i + " ");
      i++;

    }

  }

}
