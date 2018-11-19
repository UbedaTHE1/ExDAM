import java.util.Scanner;

public class Repeticio3_1 {

  public static void main(String[] args) {

    //Declarem les variables
    Scanner info = new Scanner (System.in);
    int num;

    System.out.print("Tria l'alçada del triangle: ");
    num = info.nextInt();



    for ( int i = 0 ; i < num ; i++ ) {

      System.out.print("*");

      for ( int k = 1 ; k <= i ; k++ ) {

        System.out.print("*");

      }

      System.out.print("\n");

    }


  }

}
