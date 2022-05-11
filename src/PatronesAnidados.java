import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        int userNumberOption;

        System.out.print("Ingrese un numero: \n");
        userNumberOption = scInt.nextInt();

        patronUno(userNumberOption);
    }

    private static void patronUno( int userNumber ) {

        for ( int i = 1; i <= userNumber; i++ ) {
            for ( int j = 1; j <= userNumber; j++ ) {
                if ( i == 1 || j == 1 || i == userNumber || j == userNumber ) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }

    }
}
