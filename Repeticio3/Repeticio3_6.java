import java.util.Scanner;

public class Repeticio3_6 {

    public static void main(String[] args) {

      //Declarem les variables
      Scanner info = new Scanner(System.in);
      int numMajor = 0;
      int contador = 0;

      //Mostrem el missatge al usuari.
      System.out.print("Entra nombres: ");

      int nums = -1;
  //1122333
  //mentre que els numeros siguin diferents que 0 fes les condicions
      while ( nums != 0 ) {
        nums = info.nextInt();
        /* si els numeros son iguals que el numMajor (1 == 0)suma
        (0 == 0 ) suma
        */
        if (nums == numMajor){
          contador++;
        }
        // si els numeros son mes grans que numMajor conta 1 vegada (2 > 0 --> Ha sortit el 2 1 vegada)
        if ( nums > numMajor) {
          numMajor = nums;
          contador=1;
        }

      }

      System.out.println("El major nombre entrat es el " + numMajor + " i ha aparegut " + contador + " vegades");

    }
}
