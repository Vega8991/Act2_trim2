package LoginUser;

import java.util.Scanner;

/**
 * Clase que representa a un usuario de tipo 2 con capacidad para realizar operaciones con matrices.
 */
public class UsuarioTipo2 extends Usuario {

    /**
     * Constructor para inicializar un objeto UsuarioTipo2.
     *
     * @param usuario El nombre del usuario.
     * @param contrasena La contrasena del usuario.
     */
    public UsuarioTipo2(String usuario, String contrasena) {
        super(usuario, contrasena, 2);
    }

    private int filas;
    private int columnas;
    private int[][] A;
    private int[][] B;
    private int[][] C;
    private Scanner sc = new Scanner(System.in);

    /**
     * M�todo para sumar dos matrices.
     * Solicita al usuario ingresar el n�mero de filas y columnas,
     * luego rellena las matrices A y B, y finalmente suma ambas matrices,
     * almacenando el resultado en la matriz C.
     */
    public void sumarMatrices() {
        do {
            System.out.println("Ingrese el n�mero de filas (debe ser mayor o igual a 1): ");
            filas = sc.nextInt();
        } while (filas < 1);

        do {
            System.out.println("Ingrese el n�mero de columnas (debe ser mayor o igual a 1): ");
            columnas = sc.nextInt();
        } while (columnas < 1);

        A = new int[filas][columnas];
        B = new int[filas][columnas];
        C = new int[filas][columnas];

        System.out.println("Rellenar la matriz A:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Rellenar la matriz B:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
    }

    /**
     * M�todo para mostrar las matrices A, B y la matriz resultante C.
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
