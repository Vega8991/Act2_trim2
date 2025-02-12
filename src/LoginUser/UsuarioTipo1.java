package LoginUser;import java.util.Scanner;
import java.util.Scanner;

/**
 * Clase que representa a un usuario de tipo 1 con capacidad para realizar operaciones aritméticas.
 */
public class UsuarioTipo1 extends Usuario {

    /**
     * Constructor para inicializar un objeto UsuarioTipo1.
     * @param usuario El nombre del usuario.
     * @param contraseña La contraseña del usuario.
     */
    public UsuarioTipo1(String usuario, String contraseña) {
        super(usuario, contraseña, 1);
    }

    /**
     * Permite al usuario realizar operaciones aritméticas básicas (suma, resta, multiplicación, división).
     */
    public void operacionAritmetica() {
        Scanner scanner = new Scanner(System.in); // Scanner para leer la entrada del usuario
        int opcion = -1;

        // Bucle principal que seguirá pidiendo opciones hasta que el usuario elija salir (opcion 0)
        while (opcion != 0) {
            // Mostrar las opciones de operaciones
            System.out.println("\nSelecciona una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");

            // Leer la opción seleccionada por el usuario
            try {
                opcion = Integer.parseInt(scanner.nextLine());

                if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
                    // Inicializamos la variable para el resultado
                    double resultado = 0;
                    boolean primero = true; // Para identificar si es el primer número

                    System.out.println("Introduce los números, presiona Enter para terminar.");

                    // Bucle para ingresar múltiples números
                    while (true) {
                        System.out.print("Introduce un número: ");
                        String entrada = scanner.nextLine();

                        // Si el usuario no introduce nada, salir del bucle
                        if (entrada.isEmpty()) {
                            break;
                        }

                        try {
                            // Intentar convertir la entrada a un número
                            double num = Double.parseDouble(entrada);

                            // Realizar la operación según la opción seleccionada
                            switch (opcion) {
                                case 1: // Suma
                                    resultado = Suma(resultado, num, primero);
                                    primero = false;
                                    break;
                                case 2: // Resta
                                    resultado = Resta(resultado, num, primero);
                                    primero = false;
                                    break;
                                case 3: // Multiplicación
                                    resultado = Multiplicacion(resultado, num, primero);
                                    primero = false;
                                    break;

                                case 4: // División
                                	try {
                                		resultado = Division(resultado, num, primero);
                                        primero = false;
                                        break;
                                	} catch (Exception e) {
                                		System.out.println(e.getMessage());
                                		break;
                                	}
                                    
                                default:
                                    System.out.println("Opción no válida.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Por favor, introduce un número válido.");
                        }
                    }

                    // Mostrar el resultado de la operación
                    System.out.println("El resultado es: " + resultado);
                } else if (opcion == 0 ){
                	
                } else {
                	System.out.println("Debes escoger una de las opciones");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, selecciona una opción válida.");
            }
        }

        System.out.println("Saliendo...");
    }

    /**
     * Realiza la suma de dos números.
     *
     * @param resultado El resultado acumulado.
     * @param num El número a sumar.
     * @param primero Indica si es el primer número de la operación.
     * @return El resultado de la suma.
     */
    public static double Suma(double resultado, double num, boolean primero) {
        if (primero) {
            return num;  // El primer número se asigna como resultado inicial
        } else {
            return resultado + num;  // Sumar al resultado
        }
    }

    /**
     * Realiza la resta de dos números.
     *
     * @param resultado El resultado acumulado.
     * @param num El número a restar.
     * @param primero Indica si es el primer número de la operación.
     * @return El resultado de la resta.
     */
    public static double Resta(double resultado, double num, boolean primero) {
        if (primero) {
            return num;  // El primer número se asigna como resultado inicial
        } else {
            return resultado - num;  // Restar al resultado
        }
    }

    /**
     * Realiza la multiplicación de dos números.
     *
     * @param resultado El resultado acumulado.
     * @param num El número a multiplicar.
     * @param primero Indica si es el primer número de la operación.
     * @return El resultado de la multiplicación.
     */
    public static double Multiplicacion(double resultado, double num, boolean primero) {
        if (primero) {
            return num;  // El primer número se asigna como resultado inicial
        } else {
            return resultado * num;  // Multiplicar al resultado
        }
    }

    /**
     * Realiza la división de dos números.
     *
     * @param resultado El resultado acumulado.
     * @param num El número a dividir.
     * @param primero Indica si es el primer número de la operación.
     * @return El resultado de la división.
     */
    public static double Division(double resultado, double num, boolean primero) {
        if (primero && num != 0) {
            return num;  // El primer número se asigna como resultado inicial
        } else {
            if (num != 0) {
                return resultado / num;  // Dividir al resultado
            } else {
            	throw new ArithmeticException("No se puede dividir por cero");
            }
        }
    }
}
