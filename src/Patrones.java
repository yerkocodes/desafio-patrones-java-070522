import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {

        Scanner scInt = new Scanner(System.in);
        int userInputOption;


        do {

//            System.out.printf("Ingrese cual tipo de patron ejecutar ( 1 2 3 ): \n Presione 0 para salir.");
            System.out.printf("Ingrese cual tipo de patron ejecutar: \n Presione 1 para el primer patron. \n Presione 2 para el segundo patron. \n Presione 3 para el tercer patron. \n Presione 0 para salir. \n");
            userInputOption = scInt.nextInt();

            switch ( userInputOption ) {

                case 1:
                    // Patron: *.*.*.*.*.*.*
                    System.out.print("Ingrese la cantidad a iterar: \n");
                    userInputOption = scInt.nextInt();

                    for ( int i = 1; i <= userInputOption; i++ ) {
                        if ( i%2 == 0 ) { // Es par, imprime .
                            System.out.print(".");
                        } else { // Es impar, imprime *
                            System.out.print("*");
                        }
                    }
                    System.out.print("\n");
                    break;

                case 2:
                    // Patron: 12341234
                    // Imagino que para este ejemplo el usuario indico 4, el que se imprime dos veces.
                    System.out.print("Ingrese la cantidad a iterar: \n");
                    userInputOption = scInt.nextInt();

                    for ( int i = 1; i <= 2; i++ ) {
                        for ( int j = 1; j <= userInputOption; j++ ) {
                            System.out.print(j);
                        }
                    }
                    System.out.print("\n");
                    break;

                case 3:
                    // Patron: ||*||*||*||*
                    // Supondremos que || se contara como un caracter y * como otro caracter ya que no se explica en el desafio.
                    System.out.print("Ingrese la cantidad a iterar: \n");
                    userInputOption = scInt.nextInt();

                    for ( int i = 1; i <= userInputOption; i++ ) {
                        if ( i%2 == 0 ) { // Es par
                            System.out.print("*");
                        } else { // Es impar
                            System.out.print("||");
                        }
                    }

                    System.out.print("\n");
                    break;

/*
            default:
                System.out.printf("Debe ingresar una de las tres opciones ( 1 2 3 )");
                // Instructions
*/
            }
        } while ( userInputOption != 0 );
    }
}
