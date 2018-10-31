import java.util.Scanner;

public class Repeticio1_3 {

  public static void main(String[] args) {

    //Declarem les variables
    int num;
    Scanner info = new Scanner (System.in);

    //Mostrem per pantalla missatge pel usuari
    System.out.print("Escriu un numero enter: ");
    num = info.nextInt();

    //Bucle o Repeticio
    for (int i = 1;i <= num;i++ ) {

      System.out.print(i + " ");

    }

  }

}
