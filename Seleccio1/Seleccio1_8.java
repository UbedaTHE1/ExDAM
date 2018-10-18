import java.util.Scanner;

public class Seleccio1_8 {

  public static void main(String[] args) {

    //Declarem les variables
    int num1, num2, resta;
    Scanner info = new Scanner (System.in);

    //missatge de petició dels numeros
    System.out.println("Escriu dos numeros enters: ");

    //un cop tenim els numeros els desem en les variables
    num1 = info.nextInt();
    num2 = info.nextInt();

    //comprovem si un dels numeros es un 6

    if(num1 == 6 && num2 == 6){

      //confirmamos que 1 de los dos numeros es 6
      System.out.println("Un dels numeros es 6 ");

    }else{

      //comprovem que al menys un d'ells es un 6

      if(num1 == 6 || num2 == 6){

        //un dels numeros es 6
        System.out.println("Un dels numeros es 6 ");
        System.out.println("La suma dona " + ( num1 + num2) );

        //comprovem quin d'ells es mes gran per poder fer la diferencia

        if(num1 >= num2){

          //si el numero 1 es mes gran que el dos, li restem el num1 al num2
          resta = num1 - num2;

          //mostrar el resultat en pantalla
          System.out.println("La diferencia dona " + resta);

        }

      }


    }


  }//public static void main

}//public class Seleccio1_8
