import java.util.Scanner;

public class Repeticio2_1 {

  public static void main(String[] args) {

    //Declarem les variables
    Scanner info = new Scanner (System.in);
    int num;
    int numf = 1;

    //Mostrem el missatge al usuari
    System.out.print("Introdueix un numero enter: ");


    if ( info.hasNextInt() ) {

      num = info.nextInt();

      //Bucle o repeticio
      //Si i es mes gran que 0 es compleix la condicio, i-- = resta la multiplicació.
      for ( int i = num ; i > 0 ; i-- ) {
        
        numf = numf * i;

      }
        System.out.println("El numero factorial de " + num + " es " + numf);

      //Si no es si o si enter...
    } else {

      System.out.println("Introdueix un numero enter!!");

    }


  }

}
