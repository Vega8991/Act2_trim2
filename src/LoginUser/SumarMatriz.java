package LoginUser;

import java.util.Scanner;

public class SumarMatriz {

    /*Declaracion de variables
     * int filas y columnas son el numero de estas que vamos a elegir.
     * Las matrices A y B son las dos matrices que vamos a sumar entre ellas la matriz C es donde vamos a guardar el resultado
     */

    
    private int filas, columnas;
    private int[][] A, B, C;
    private Scanner sc = new Scanner(System.in);

    /* Método para sumar matrices*/
    public void sumarMatrices() {
        /*Solicitar el número de filas y columnas*/
        do {
            System.out.println("Ingrese el número de filas (debe ser mayor o igual a 1): ");
            filas = sc.nextInt();
        } while (filas < 1);

        do {
            System.out.println("Ingrese el número de columnas (debe ser mayor o igual a 1): ");
            columnas = sc.nextInt();
        } while (columnas < 1);

        /* Inicializar las matrices después de conocer filas y columnas(error corregido)*/
        A = new int[filas][columnas];
        B = new int[filas][columnas];
        C = new int[filas][columnas];

        /*  Rellenar la matriz A */
        System.out.println("Rellenar la matriz A:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }

        /*  Rellenar la matriz B */
        System.out.println("Rellenar la matriz B:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                B[i][j] = sc.nextInt();
            }
        }

        /*  Sumar las matrices A y B y guardar el resultado en C*/
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
    }

    /*  Método para mostrar las matrices */
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
