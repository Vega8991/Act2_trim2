package LoginUser;

import java.util.Scanner;

public class UsuarioTipo1 extends Usuario {
    public UsuarioTipo1(String usuario, String contraseña) {
        super(usuario, contraseña, 1);
    }

    public void operacionAritmetica() {
        Scanner scanner = new Scanner(System.in); // Scanner para leer la entrada del usuario
        int opcion = -1;

        // Bucle principal que seguirá pidiendo opciones hasta que el usuario elija
        // salir (opcion 0)
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

                if (opcion != 0) {
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

                    // Mostrar el resultado de la operación
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
            return num; // El primer número se asigna como resultado inicial
        } else {
            return resultado + num; // Sumar al resultado
        }
    }

    public static double Resta(double resultado, double num, boolean primero) {
        if (primero) {
            return num; // El primer número se asigna como resultado inicial
        } else {
            return resultado - num; // Restar al resultado
        }
    }

    public static double Multiplicacion(double resultado, double num, boolean primero) {
        if (primero) {
            return num; // El primer número se asigna como resultado inicial
        } else {
            return resultado * num; // Multiplicar al resultado
        }
    }

    public static double Division(double resultado, double num, boolean primero) {
        if (primero) {
            return num; // El primer número se asigna como resultado inicial
        } else {
            if (num != 0) {
                return resultado / num; // Dividir al resultado
            } else {
                System.out.println("Error: No se puede dividir entre cero.");
                return resultado; // No realizar la división, mantener el resultado actual
            }
        }
    }
}
