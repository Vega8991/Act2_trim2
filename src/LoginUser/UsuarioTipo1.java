import java.util.Scanner;

/**
 * The UsuarioTipo1 class extends the Usuario class and provides functionality
 * for performing basic arithmetic operations (addition, subtraction,
 * multiplication, division)
 * based on user input.
 * 
 * Constructor:
 * - UsuarioTipo1(String usuario, String contraseña): Initializes a new instance
 * of UsuarioTipo1
 * with the specified username and password, and sets the user type to 1.
 * 
 * Methods:
 * - void operacionAritmetica(): Prompts the user to select an arithmetic
 * operation and then
 * allows the user to input multiple numbers to perform the selected operation.
 * The result
 * of the operation is displayed after the user finishes inputting numbers.
 * 
 * Static Methods:
 * - double Suma(double resultado, double num, boolean primero): Performs
 * addition. If it's the
 * first number, it is assigned as the initial result; otherwise, it is added to
 * the current result.
 * - double Resta(double resultado, double num, boolean primero): Performs
 * subtraction. If it's the
 * first number, it is assigned as the initial result; otherwise, it is
 * subtracted from the current result.
 * - double Multiplicacion(double resultado, double num, boolean primero):
 * Performs multiplication.
 * If it's the first number, it is assigned as the initial result; otherwise, it
 * is multiplied with the current result.
 * - double Division(double resultado, double num, boolean primero): Performs
 * division. If it's the
 * first number, it is assigned as the initial result; otherwise, it divides the
 * current result by the number.
 * If the number is zero, an error message is displayed and the current result
 * is maintained.
 */
public class UsuarioTipo1 extends Usuario {
    public UsuarioTipo1(String usuario, String contraseña) {
        super(usuario, contraseña, 1);
    }

    public void operacionAritmetica() {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {

            System.out.println("\nSelecciona una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                if (opcion != 0) {

                    double resultado = 0;
                    boolean primero = true;

                    System.out.println("Introduce los números, presiona Enter para terminar.");

                    while (true) {
                        System.out.print("Introduce un número: ");
                        String entrada = scanner.nextLine();

                        if (entrada.isEmpty()) {
                            break;
                        }

                        try {

                            double num = Double.parseDouble(entrada);

                            switch (opcion) {
                                case 1:
                                    resultado = Suma(resultado, num, primero);
                                    primero = false;
                                    break;
                                case 2:
                                    resultado = Resta(resultado, num, primero);
                                    primero = false;
                                    break;
                                case 3:
                                    resultado = Multiplicacion(resultado, num, primero);
                                    primero = false;
                                    break;

                                case 4:
                                    resultado = Division(resultado, num, primero);
                                    primero = false;
                                    break;
                                default:
                                    System.out.println("Opción no válida.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Por favor, introduce un número válido.");
                        }
                    }

                    System.out.println("El resultado es: " + resultado);
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, selecciona una opción válida.");
            }
        }

        System.out.println("Saliendo...");

    }

    public static double Suma(double resultado, double num, boolean primero) {
        if (primero) {
            return num;
        } else {
            return resultado + num;
        }
    }

    public static double Resta(double resultado, double num, boolean primero) {
        if (primero) {
            return num;
        } else {
            return resultado - num;
        }
    }

    public static double Multiplicacion(double resultado, double num, boolean primero) {
        if (primero) {
            return num;
        } else {
            return resultado * num;
        }
    }

    public static double Division(double resultado, double num, boolean primero) {
        if (primero) {
            return num;
        } else {
            if (num != 0) {
                return resultado / num;
            } else {
                System.out.println("Error: No se puede dividir entre cero.");
                return resultado;
            }
        }
    }
}
