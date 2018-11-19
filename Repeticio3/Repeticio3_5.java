import java.util.Scanner;

public class Repeticio3_5 {

    public static void main(String[] args) {

        Scanner info = new Scanner(System.in);
        System.out.print("Tria l'alçada del triangle: ");
        int num = info.nextInt();

        for(int numB = num-1,numAst=1; numB>=0; numB--, numAst += 2){
            //Espacios en blanco
            for(int i=1;i<=numB;i++){
                System.out.print(" ");
            }

            //Asteriscos
            for(int j=1;j<=numAst;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
