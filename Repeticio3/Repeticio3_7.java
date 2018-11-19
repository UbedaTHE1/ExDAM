import java.util.Scanner;

public class Repeticio3_7 {

    public static void main(String[] args) {

      //Declarem les variables
      Scanner info = new Scanner(System.in);

      for ( int i = 0 ; i < 10 ; i++ ) {

        for ( int k = 0 ; k < 10 ; k++ ) {

          for ( int j = 0 ; j < 10 ; j++ ) {

            for ( int x = 0 ; x < 10 ; x++ ) {

              for ( int u = 0 ; u < 10 ; u++ ) {

                System.out.println(i + "-"+ k + "-" + j + "-" + x + "-" + u);

              }

            }

          }

        }

      }

    }
}
