import java.util.Scanner;

public class Consola2_4 {

  public static void main(String[] args) {


  int codi;
  Scanner info = new Scanner (System.in);


  System.out.print("Escriu un codi ASCII entre 0 i 127: ");

  codi = info.nextInt();

  System.out.printf("%c %n" , codi);

  }

}
