package LoginUser;
import java.util.Scanner;

/**
 * Clase que representa a un usuario de tipo 1 con capacidad para realizar operaciones aritm�ticas.
 */
public class UsuarioTipo1 extends Usuario {

    /**
     * Constructor para inicializar un objeto UsuarioTipo1.
     * 
     * @param usuario El nombre del usuario.
     * @param contrasena La contrasena del usuario.
     */
    public UsuarioTipo1(String usuario, String contrasena) {
        super(usuario, contrasena, 1);
    }

    /**
     * Permite al usuario realizar operaciones aritm�ticas b�sicas (suma, resta, multiplicaci�n, divisi�n).
     */
    public void operacionAritmetica() {
        Scanner scanner = new Scanner(System.in); // Scanner para leer la entrada del usuario
        int opcion = -1;

        // Bucle principal que seguir� pidiendo opciones hasta que el usuario elija salir (opcion 0)
        while (opcion != 0) {
            // Mostrar las opciones de operaciones
            System.out.println("\nSelecciona una operaci�n:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");

            // Leer la opci�n seleccionada por el usuario
            try {
                opcion = Integer.parseInt(scanner.nextLine());

                if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
                    // Inicializamos la variable para el resultado
                    double resultado = 0;
                    boolean primero = true; // Para identificar si es el primer n�mero

                    System.out.println("Introduce los n�meros, presiona Enter para terminar.");

                    // Bucle para ingresar m�ltiples n�meros
                    while (true) {
                        System.out.print("Introduce un n�mero: ");
                        String entrada = scanner.nextLine();

                        // Si el usuario no introduce nada, salir del bucle
                        if (entrada.isEmpty()) {
                            break;
                        }

                        try {
                            // Intentar convertir la entrada a un n�mero
                            double num = Double.parseDouble(entrada);

                            // Realizar la operaci�n seg�n la opci�n seleccionada
                            switch (opcion) {
                                case 1: // Suma
                                    resultado = Suma(resultado, num, primero);
                                    primero = false;
                                    break;
                                case 2: // Resta
                                    resultado = Resta(resultado, num, primero);
                                    primero = false;
                                    break;
                                case 3: // Multiplicaci�n
                                    resultado = Multiplicacion(resultado, num, primero);
                                    primero = false;
                                    break;

                                case 4: // Divisi�n
                                    try {
                                        resultado = Division(resultado, num, primero);
                                        primero = false;
                                        break;
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                        break;
                                    }

                                default:
                                    System.out.println("Opci�n no v�lida.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Por favor, introduce un n�mero v�lido.");
                        }
                    }

                    // Mostrar el resultado de la operaci�n
                    System.out.println("El resultado es: " + resultado);
                } else if (opcion == 0) {

                } else {
                    System.out.println("Debes escoger una de las opciones");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, selecciona una opci�n v�lida.");
            }
        }

        System.out.println("Saliendo...");
    }

    /**
     * Realiza la suma de dos n�meros.
     * 
     * @param resultado El resultado acumulado.
     * @param num El n�mero a sumar.
     * @param primero Indica si es el primer n�mero de la operaci�n.
     * @return El resultado de la suma.
     */
    public static double Suma(double resultado, double num, boolean primero) {
        if (primero) {
            return num;  // El primer n�mero se asigna como resultado inicial
        } else {
            return resultado + num;  // Sumar al resultado
        }
    }

    /**
     * Realiza la resta de dos n�meros.
     * 
     * @param resultado El resultado acumulado.
     * @param num El n�mero a restar.
     * @param primero Indica si es el primer n�mero de la operaci�n.
     * @return El resultado de la resta.
     */
    public static double Resta(double resultado, double num, boolean primero) {
        if (primero) {
            return num;  // El primer n�mero se asigna como resultado inicial
        } else {
            return resultado - num;  // Restar al resultado
        }
    }

    /**
     * Realiza la multiplicaci�n de dos n�meros.
     * 
     * @param resultado El resultado acumulado.
     * @param num El n�mero a multiplicar.
     * @param primero Indica si es el primer n�mero de la operaci�n.
     * @return El resultado de la multiplicaci�n.
     */
    public static double Multiplicacion(double resultado, double num, boolean primero) {
        if (primero) {
            return num;  // El primer n�mero se asigna como resultado inicial
        } else {
            return resultado * num;  // Multiplicar al resultado
        }
    }

    /**
     * Realiza la divisi�n de dos n�meros.
     * 
     * @param resultado El resultado acumulado.
     * @param num El n�mero a dividir.
     * @param primero Indica si es el primer n�mero de la operaci�n.
     * @return El resultado de la divisi�n.
     * @throws ArithmeticException Si el n�mero es 0.
     */
    public static double Division(double resultado, double num, boolean primero) throws ArithmeticException {
        if (primero && num != 0) {
            return num;  // El primer n�mero se asigna como resultado inicial
        } else {
            if (num != 0) {
                return resultado / num;  // Dividir al resultado
            } else {
                throw new ArithmeticException("No se puede dividir por cero");
            }
        }
    }
}

