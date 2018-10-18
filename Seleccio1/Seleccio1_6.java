import java.util.Scanner;

public class Seleccio1_6 {

  public static void main(String[] args) {

    //Declarem les variables
    int num1, num2, num3;
    Scanner info = new Scanner (System.in);

    System.out.print("Escriu tres numeros: ");

    num1 = info.nextInt();
    num2 = info.nextInt();
    num3 = info.nextInt();


    //Indiquem que si tots els numeros són iguals, posi per pantalla que son iguals
    if ( num1 == num2 && num1 == num3 && num2 == num3 ) {

      System.out.println("Son tots iguals!");
    //Indiquem que si no són iguals, és a dir, diferents, posi per pantalla que son diferents
    } else if ( num1 != num2 && num1 != num3 && num2 != num3 ) {

      System.out.println("Són tots diferents :C");
    // Indiquem que si ha algun de igual o algun de diferent, posi per pantalla.
    } else {

      System.out.println("Hi ha algun igual i de diferent...");

    }



  }

}
