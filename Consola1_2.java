import java.util.Scanner;

public class Consola1_2 {

  public static void main(String[] args){


// com sempre primer crearem les variables, en aquest cast seran double per els
// decimals

    double cels;
    double fara;


//Ara creem un scanner perque el usuari pugui escriure el valor en celsius.

    Scanner graus = new Scanner(System.in);


//Mostrem per pantalla... Ha de ser "double"

    System.out.print("Entra una temperatura en graus Celsius: ");

    cels = graus.nextDouble();

//operació per cpnvertir els celsius per faranheits.
    fara = (1.8 * cels) + 32;

    System.out.println(cels + " Celsius equivalen a : " + fara + " farenheits");

  }

}
