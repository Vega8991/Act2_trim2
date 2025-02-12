package LoginUser;
import java.util.Scanner;

public class Login {   

    public static void main(String[] args) {
    	
        UsuarioTipo1 usuario1 = new UsuarioTipo1("Usuario1", "Contrasena1");
    	UsuarioTipo2 usuario2 = new UsuarioTipo2("Usuario2", "Contrasena2");
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Introduce nombre del usuario 1 (solo letras y números): ");
            String userName1 = scanner.nextLine();
            System.out.print("Introduce la contraseña del usuario 1(mínimo 6 carácteres, debe contener un número): ");
            String contrasena1 = scanner.nextLine();
            usuario1.comprobarUsuario(userName1, contrasena1);
            System.out.println("Inicio de sesión exitoso en usuario 2.");
            usuario1.operacionAritmetica();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        try {
            System.out.print("Introduce nombre del usuario 2 (solo letras y números): ");
            String userName2 = scanner.nextLine();
            System.out.print("Introduce la contraseña del usuario 2(mínimo 6 carácteres, debe contener un número): ");
            String contrasena2 = scanner.nextLine();
            usuario2.comprobarUsuario(userName2, contrasena2);
            System.out.println("Inicio de sesión exitoso.");
            usuario2.sumarMatrices();
            usuario2.mostrarMatrices();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}