package LoginUser;
import java.util.Scanner;

/**
 * Clase principal que gestiona el proceso de inicio de sesión para dos tipos de usuarios
 * y la ejecución de sus respectivas operaciones.
 */
public class Login {
    
    /**
     * Método principal que ejecuta el flujo del programa.
     */
    public static void main(String[] args) {
    
        // Creación de instancias de usuarios con credenciales predefinidas.
        UsuarioTipo1 usuario1 = new UsuarioTipo1("Usuario1", "Contrasena1");
        UsuarioTipo2 usuario2 = new UsuarioTipo2("Usuario2", "Contrasena2");
        Scanner scanner = new Scanner(System.in);
        boolean sesionIniciada = false;
        
        while (!sesionIniciada) {
        	try {
                System.out.print("Introduce nombre del usuario 1 (solo letras y números): ");
                String userName1 = scanner.nextLine();
                System.out.print("Introduce la contraseña del usuario 1(mínimo 6 caracteres, debe contener un número): ");
                String contrasena1 = scanner.nextLine();
                
                // Verifica las credenciales del usuario 1.
                if (usuario1.comprobarUsuario(userName1, contrasena1)) {
                	sesionIniciada = true;
                	System.out.println("Inicio de sesión exitoso en el usuario 1.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
        try {
            // Realiza una operación aritmética del usuario 1.
            usuario1.operacionAritmetica();
            sesionIniciada = false;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
        while (!sesionIniciada) {
        	try {
                System.out.print("Introduce nombre del usuario 2 (solo letras y números): ");
                String userName2 = scanner.nextLine();
                System.out.print("Introduce la contraseña del usuario 2(mínimo 6 caracteres, debe contener un número): ");
                String contrasena2 = scanner.nextLine();
                
                // Verifica las credenciales del usuario 2.
                if (usuario2.comprobarUsuario(userName2, contrasena2)) {
                	sesionIniciada = true;
                	System.out.println("Inicio de sesión exitoso en el usuario 2.");
                }
                
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        try {
            // Realiza operaciones con matrices del usuario 2.
            usuario2.sumarMatrices();
            usuario2.mostrarMatrices();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}