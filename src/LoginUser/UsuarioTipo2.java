import java.util.Scanner;

/**
 * Clase que representa a un usuario de tipo 2 con capacidad para realizar operaciones con matrices.
 */
public class UsuarioTipo2 extends Usuario {

    /**
     * Constructor para inicializar un objeto UsuarioTipo2.
     *
     * @param usuario El nombre del usuario.
     * @param contraseña La contraseña del usuario.
     */
    public UsuarioTipo2(String usuario, String contraseña) {
        super(usuario, contraseña, 2);
    }

    /**
     * Número de filas de las matrices.
     */
    private int filas;

    /**
     * Número de columnas de las matrices.
     */
    private int columnas;

    /**
     * Matriz A para operaciones.
     */
    private int[][] A;

    /**
     * Matriz B para operaciones.
     */
    private int[][] B;

    /**
     * Matriz C para almacenar el resultado de la suma de A y B.
     */
    private int[][] C;

    /**
     * Scanner para leer la entrada del usuario.
     */
    private Scanner sc = new Scanner(System.in);

    /**
     * Método para sumar dos matrices.
     * Solicita al usuario ingresar el número de filas y columnas,
     * luego rellena las matrices A y B, y finalmente suma ambas matrices,
     * almacenando el resultado en la matriz C.
     */
    public void sumarMatrices() {
        /* Solicitar el número de filas y columnas */
        do {
            System.out.println("Ingrese el número de filas (debe ser mayor o igual a 1): ");
            filas = sc.nextInt();
        } while (filas < 1);

        do {
            System.out.println("Ingrese el número de columnas (debe ser mayor o igual a 1): ");
            columnas = sc.nextInt();
        } while (columnas < 1);

        /* Inicializar las matrices después de conocer filas y columnas */
        A = new int[filas][columnas];
        B = new int[filas][columnas];
        C = new int[filas][columnas];

        /* Rellenar la matriz A */
        System.out.println("Rellenar la matriz A:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }

        /* Rellenar la matriz B */
        System.out.println("Rellenar la matriz B:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                B[i][j] = sc.nextInt();
            }
        }

        /* Sumar las matrices A y B y guardar el resultado en C */
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
    }

    /**
     * Método para mostrar las matrices A, B y la matriz resultante C.
     */
    public void mostrarMatrices() {
        System.out.println("Matriz A:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%3d", A[i][j]);
            }
            System.out.println();
        }

        System.out.println("Matriz B:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%3d", B[i][j]);
            }
            System.out.println();
        }

        System.out.println("Matriz Suma (A + B):");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("%3d", C[i][j]);
            }
            System.out.println();
        }
    }
}
