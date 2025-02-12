
import java.util.Scanner;

/**
 * The UsuarioTipo2 class extends the Usuario class and provides functionality
 * to sum two matrices and display the result.
 * 
 * <p>
 * This class includes methods to:
 * <ul>
 * <li>Request the number of rows and columns for the matrices</li>
 * <li>Fill two matrices with user input</li>
 * <li>Sum the two matrices</li>
 * <li>Display the original matrices and the resulting matrix</li>
 * </ul>
 * </p>
 * 
 * <p>
 * Instance variables:
 * <ul>
 * <li>filas - the number of rows in the matrices</li>
 * <li>columnas - the number of columns in the matrices</li>
 * <li>A - the first matrix</li>
 * <li>B - the second matrix</li>
 * <li>C - the matrix to store the result of the sum of A and B</li>
 * <li>sc - a Scanner object for user input</li>
 * </ul>
 * </p>
 * 
 * <p>
 * Constructor:
 * <ul>
 * <li>UsuarioTipo2(String usuario, String contraseña) - initializes the user
 * with a username, password, and user type 2</li>
 * </ul>
 * </p>
 * 
 * <p>
 * Methods:
 * <ul>
 * <li>sumarMatrices() - requests the number of rows and columns, fills matrices
 * A and B with user input, and sums them into matrix C</li>
 * <li>mostrarMatrices() - displays matrices A, B, and the resulting matrix
 * C</li>
 * </ul>
 * </p>
 */
public class UsuarioTipo2 extends Usuario {
    public UsuarioTipo2(String usuario, String contraseña) {
        super(usuario, contraseña, 2);
    }

    private int filas, columnas;
    private int[][] A, B, C;
    private Scanner sc = new Scanner(System.in);

    public void sumarMatrices() {

        do {
            System.out.println("Ingrese el número de filas (debe ser mayor o igual a 1): ");
            filas = sc.nextInt();
        } while (filas < 1);

        do {
            System.out.println("Ingrese el número de columnas (debe ser mayor o igual a 1): ");
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
