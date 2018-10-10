import java.util.Scanner;

public class Consola2_1 {

  public static void main(String[] args) {

    long num1, num2, suma;

    Scanner obtInfo = new Scanner(System.in);

    System.out.print("Escriu dos numeros: ");

    num1 = obtInfo.nextLong();
    num2 = obtInfo.nextLong();

    suma = num1 + num2;

    //"%8d%n" posem el numero per els espais.
    System.out.printf("%8d%n", num1);
    System.out.printf("+%7d%n", num2);
    System.out.printf("--------%n");
    System.out.printf("%8d%n", suma);


  }


}
