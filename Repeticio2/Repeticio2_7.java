import java.util.Scanner;

public class Repeticio2_7 {

  public static void main(String[] args) {

    //declarem les variables
    int num1, num2;
    int cont = 0;



    for (int i = 100;i <= 1000 ;i++ ) {
      num1 = i % 5;
      num2 = i % 6;


      if ( num1 == 0 && num2 == 0 ) {

        System.out.print(i);

      }
      cont++;


    }
  }
}
