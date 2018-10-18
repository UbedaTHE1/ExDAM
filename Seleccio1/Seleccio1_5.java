import java.util.Scanner;

public class Seleccio1_5 {

  public static void main(String[] args) {


    //Declarem les variables
    int num, numXifres;
    Scanner info = new Scanner (System.in);




    //Mostrem per pantalla
    System.out.print("Escriu un numero enter entre 0 i 99999: ");

    num = info.nextInt();


    if ( num > 0 && num < 99999 ) {

      //Volem saber cuantes xifres té el "num"
      numXifres = String.valueOf(num).length();
      
      System.out.println( num + " te " + numXifres + " xifres." );

    } else {

      System.out.println("EL numero es molt llarg...");

    }

  }

}
