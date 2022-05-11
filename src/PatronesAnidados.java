import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        int userNumberOption;

        do {
            System.out.print("Seleccione cual patron desea ejecutar: \n Presione 1 para el primer patron. \n Presione 2 para el segundo patron. \n Presione 3 para el tercer patron. \n Presione 4 para el cuarto patron. \n \n Presione 0 para salir. \n");
            userNumberOption = scInt.nextInt();

            switch (userNumberOption) {
                case 1:
                    System.out.print("Ingrese un numero a iterar: \n");
                    userNumberOption = scInt.nextInt();
                    squarePattern(userNumberOption);
                    break;
                case 2:
                    System.out.print("Ingrese un numero a iterar: \n");
                    userNumberOption = scInt.nextInt();
                    zPattern(userNumberOption);
                    break;
                case 3:
                    System.out.print("Ingrese un numero a iterar: \n");
                    userNumberOption = scInt.nextInt();
                    xPattern(userNumberOption);
                    break;
                case 4:
                    System.out.print("Ingrese un numero a iterar: \n");
                    userNumberOption = scInt.nextInt();
                    zBold(userNumberOption);
                    break;
/*
            default:
                throw new IllegalStateException("Unexpected value: " + userNumberOption);
*/
            }
        } while ( userNumberOption != 0 );



    }

    private static void squarePattern(int userNumber ) {

        for ( int i = 1; i <= userNumber; i++ ) {
            for ( int j = 1; j <= userNumber; j++ ) {
                if ( i == 1 || j == 1 || i == userNumber || j == userNumber ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("Patron finalizado con exito! \n \n");

    }

    private static void zPattern (int userNumber ) {

        for ( int i = 1; i <= userNumber; i++ ) {
            for ( int j = 1; j <= userNumber; j++ ) {
                if ( i == 1 || i == userNumber || i + j == userNumber ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("Patron finalizado con exito! \n \n");

    }

    private static void xPattern (int userNumber) {

        for ( int i = 1; i <= userNumber; i++ ) {
            for ( int j = 1; j <= userNumber; j++ ) {
                if ( i == j || i + j == userNumber + 1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("Patron finalizado con exito! \n \n");

    }

    private static void zBold (int userNumber) {

        for ( int i = 1; i <= userNumber; i++ ) {
            for ( int j = 1; j <= userNumber; j++ ) {
                if ( i == j || j != 1 && j != userNumber ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        System.out.print("Patron finalizado con exito! \n \n");

    }
}
