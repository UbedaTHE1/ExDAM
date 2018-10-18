import java.util.Scanner;

public class Seleccio1_4 {

  public static void main(String[] args) {

    //Declaració de variables
    int codi;
    int ultimaXifra;
    int noUltimaXifra;
    Scanner teclat = new Scanner (System.in);


    //Mostrem per pantalla el codi
    System.out.print("Escriu el codi del bitllet: ");

    codi = teclat.nextInt();

    //Primer hem de treure la ultima xifra del codi, per això fem el modul per 10
    //Guardarà la ultima xifra del codi a la variable "ultimaXifra".
    ultimaXifra = codi % 10;

    //Per guardar el codi sense la ultima xifra dividirem per 10
    //Guardarà el codi sense la ultima xifra a la variable noUltimaXifra.
    noUltimaXifra = codi / 10;



    //Fem la condició
    //si el residu de la divisió entre 7 és igual que el numero extret del codi serà vàlid.
    if ( noUltimaXifra % 7 == ultimaXifra ) {

      System.out.println("El codi es valid");

    } else {

      System.out.println("El codi no es valid");

    }



  }

}
