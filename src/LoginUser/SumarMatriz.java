package LoginUser;

import java.util.Scanner;
public class SumarMatriz {

    //Crear variables de filas y columnas

    int filas, columnas;
   
    //Creacion de Matrizes. La matriz A y B son las matrizes a sumar y la C es donde se guardaran los resultados
    int[][] A = new int[filas][columnas];
    int[][] B = new int[filas][columnas];
    int[][] C = new int[filas][columnas];
    Scanner sc = new Scanner(System.in);

    public void SumarMatrizes(){
        // Definir el numero de filas y columnas que tienen las matrizes

        do {
            System.out.println("Ingrese el numero de filas: ");
            filas = sc.nextInt();
        } while(filas > 1);

        do {
            System.out.println("Ingrese el numero de columnas: ");
            columnas = sc.nextInt();
        }while (columnas > 1);
        // Bucles for para rellenar matrizes

        for (int i = 0; i < A.length; i++ ){
            for (int j = 0; j < A[i].length; j ++){
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                A[i][j] = sc.nextInt();
            }

        }
       
        for (int i = 0; i < B.length; i++ ){
            for (int j = 0; j < B[i].length; j ++){
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                A[i][j] = sc.nextInt();
            }

        }

        // Sumar matriz A y B y rellenar en C

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
    }

    public void MostrarMatrizes(){

        //mostrar por pantalla las matrices A y B
        System.out.println("matriz A:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%3d", A[i][j]);
            }
            System.out.println();
        }
        System.out.println("matriz B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.printf("%3d", B[i][j]);
            }
            System.out.println();
        }

        //mostrar la matriz suma de A + B
        System.out.println("matriz Suma:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.printf("%3d", C[i][j]);
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
       

    }
}
